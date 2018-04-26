package be.ing.api.chatbot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.gax.paging.Page;
import com.google.appengine.api.appidentity.AppIdentityService;
import com.google.appengine.api.appidentity.AppIdentityServiceFactory;
import com.google.appengine.api.urlfetch.*;
import com.google.apphosting.api.ApiProxy;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.io.BaseEncoding;
import com.google.gson.Gson;
import io.swagger.client.model.CleanDLKPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DataLakeProviderAPI {

    @Qualifier("API_FOURCAST_VERSION")
    @Autowired
    private String API_FOURCAST_VERSION;

    @Qualifier("API_FOURCAST_DOMAIN")
    @Autowired
    private String API_FOURCAST_DOMAIN;

    @Qualifier("API_FOURCAST_PATH")
    @Autowired
    private String API_FOURCAST_PATH;

    @Qualifier("API_FOURCAST_TOKEN")
    @Autowired
    private String API_FOURCAST_TOKEN;

    ObjectMapper objectMapper = new ObjectMapper();

    public String getResponse(String query) throws Exception {

        final AppIdentityService appIdentity = AppIdentityServiceFactory.getAppIdentityService();
        final BaseEncoding base64 = BaseEncoding.base64();

        //DataLakeProviderAPI.authImplicit();

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

    static void authImplicit() {
        // If you don't specify credentials when constructing the client, the client library will
        // look for credentials via the environment variable GOOGLE_APPLICATION_CREDENTIALS.
        Storage storage = StorageOptions.getDefaultInstance().getService();

        System.out.println("Buckets:");
        Page<Bucket> buckets = storage.list();
        for (Bucket bucket : buckets.iterateAll()) {
            System.out.println(bucket.toString());
        }
    }
}
