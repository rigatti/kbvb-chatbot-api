package be.ing.api.chatbot.configuration;

import be.ing.api.chatbot.service.ApiAiBotProviderAPI;
import be.ing.api.chatbot.service.DataLakeProviderAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatbotPlatformConfiguration {

    @Bean
    public ApiAiBotProviderAPI createBotProviderAPI() {
        return new ApiAiBotProviderAPI();
    }

    @Bean
    public DataLakeProviderAPI createDataLakeProviderAPI() {
        return new DataLakeProviderAPI();
    }

}
