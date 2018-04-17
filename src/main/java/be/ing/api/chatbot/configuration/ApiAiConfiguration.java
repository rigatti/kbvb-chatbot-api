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
public class ApiAiConfiguration {

    private final String API_PORT                       = "443";

    @Bean(name = "API_DIALOGFLOW_DOMAIN")
    public String API_DIALOGFLOW_DOMAIN() {
        return "api.dialogflow.com";
    }

    @Bean(name = "API_DIALOGFLOW_PATH")
    public String API_DIALOGFLOW_PATH() {
        return "/v1/query";
    }

    @Bean(name = "API_DIALOGFLOW_VERSION")
    public String API_DIALOGFLOW_VERSION() {
        return "20150910";
    }

    @Bean(name = "API_DIALOGFLOW_TOKEN")
    public String API_DIALOGFLOW_TOKEN() { return "d882f9d3118d4f6986bcb77f1facab62"; }

    private boolean isProxyMandatory() throws UnknownHostException {
        return isIngEmployeeNetwork();
    }

    private boolean isIngEmployeeNetwork() throws UnknownHostException {
        return StringUtils.startsWith(Inet4Address.getLocalHost().getHostAddress(), "10.241.");
    }

    @Bean(name = "RestTemplate")
    public RestTemplate HttpClient() throws UnknownHostException {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

        if (isProxyMandatory()) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 3128));
            requestFactory.setProxy(proxy);
        }

        return new RestTemplate(requestFactory);
    }
}
