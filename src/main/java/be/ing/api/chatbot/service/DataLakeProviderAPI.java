package be.ing.api.chatbot.service;

import be.ing.api.chatbot.service.model.datalake.CleanDLKPerson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.appengine.api.appidentity.AppIdentityService;
import com.google.appengine.api.appidentity.AppIdentityServiceFactory;
import com.google.appengine.api.urlfetch.*;
import com.google.apphosting.api.ApiProxy;
import com.google.common.io.BaseEncoding;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DataLakeProviderAPI {

    ObjectMapper objectMapper = new ObjectMapper();

    public String getResponse(String query) throws Exception {

        final AppIdentityService appIdentity = AppIdentityServiceFactory.getAppIdentityService();
        final BaseEncoding base64 = BaseEncoding.base64();

        Map<String, Object> h = new HashMap<>();
        h.put("typ", "JWT");
        h.put("alg", "RS256");

        String header = base64.encode(new Gson().toJson(h).getBytes());
        String clientEmail = appIdentity.getServiceAccountName();

        long epochTime = System.currentTimeMillis() / 1000;
        long expire = epochTime + 60 * 60; // an hour from now

        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("iss", clientEmail);
        claims.put("sub", clientEmail);
        claims.put("aud", "datalake-cache.appspot.com");
        claims.put("iat", epochTime);
        claims.put("exp", expire);

        String payload = base64.encode(new Gson().toJson(claims).getBytes());
        String toSign = String.format("%s.%s", header, payload);
        AppIdentityService.SigningResult result = appIdentity.signForApp(toSign.getBytes());

        String signedJwt = String.format("%s.%s", toSign, base64.encode(result.getSignature()));

        URL url = new URL("https://datalake-cache.appspot.com/_ah/api/kbvb/v1/dlkPersons/" + 10002);
        FetchOptions fetchOptions = FetchOptions.Builder.validateCertificate().doNotFollowRedirects().setDeadline(30d); //Set timeout to 30 seconds
        HTTPRequest req = new HTTPRequest(url, HTTPMethod.GET.GET, fetchOptions);

        req.addHeader(new HTTPHeader("X-Appengine-Inbound-Appid", ApiProxy.getCurrentEnvironment().getAppId()));
        req.addHeader(new HTTPHeader("Content-Type", "application/json"));
        req.addHeader(new HTTPHeader("Authorization", "Bearer " + signedJwt));

        HTTPResponse res = URLFetchServiceFactory.getURLFetchService().fetch(req);
        if(res.getResponseCode() < 200 || res.getResponseCode() >= 400) {
            throw new IOException(String.format("Response code: %d\nReponse content:\n%s", res.getResponseCode(), new String(res.getContent())));
        }

        CleanDLKPerson dlkPerson = objectMapper.readValue(res.getContent(), CleanDLKPerson.class);

        return new String(res.getContent());
    }
}
