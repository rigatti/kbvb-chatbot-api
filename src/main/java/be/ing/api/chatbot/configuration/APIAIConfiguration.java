package be.ing.api.chatbot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Configuration
public class APIAIConfiguration {

    private final String API_PORT                       = "443";

    @Bean(name = "ENV_INTRANET")
    public boolean ENV_INTRANET() { return false; }

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

    @Bean(name = "RestTemplate")
    public RestTemplate HttpClient() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

        if (ENV_INTRANET()) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 3128));
            requestFactory.setProxy(proxy);
        }

        return new RestTemplate(requestFactory);
    }
}
