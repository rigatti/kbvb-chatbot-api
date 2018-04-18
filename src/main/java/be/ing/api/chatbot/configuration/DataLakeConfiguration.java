package be.ing.api.chatbot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLakeConfiguration {

    private final String API_PORT                       = "443";

    @Bean(name = "API_FOURCAST_DOMAIN")
    public String API_FOURCAST_DOMAIN() {
        return "api.fourcast.com";
    }

    @Bean(name = "API_FOURCAST_PATH")
    public String API_FOURCAST_PATH() {
        return "/v1/query";
    }

    @Bean(name = "API_FOURCAST_VERSION")
    public String API_FOURCAST_VERSION() {
        return "20150910";
    }

    @Bean(name = "API_FOURCAST_TOKEN")
    public String API_FOURCAST_TOKEN() { return "xxxxxxx"; }
}
