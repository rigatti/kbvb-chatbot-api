package be.ing.api.chatbot.configuration;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.UnknownHostException;

@Configuration
public class CommunicationConfiguration {

    @Bean(name = "RestTemplate")
    public RestTemplate HttpClient() throws UnknownHostException {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

        if (isProxyMandatory()) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 3128));
            requestFactory.setProxy(proxy);
        }

        return new RestTemplate(requestFactory);
    }

    private boolean isProxyMandatory() throws UnknownHostException {
        return isIngEmployeeNetwork();
    }

    private boolean isIngEmployeeNetwork() throws UnknownHostException {
        return StringUtils.startsWithAny(Inet4Address.getLocalHost().getHostAddress(), new String[]{"10.241.", "10.243."});
    }
}
