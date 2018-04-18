package be.ing.api.chatbot.business;

import be.ing.api.chatbot.exception.InvalidSpeechException;
import be.ing.api.chatbot.model.ChatAnswer;
import be.ing.api.chatbot.model.ChatMessages.ChatMessage;
import be.ing.api.chatbot.service.ApiAiBotProviderAPI;
import be.ing.api.chatbot.service.DataLakeProviderAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AiLogic {

    @Autowired
    private ApiAiBotProviderAPI apiAiBotProviderAPI;

    @Autowired
    private DataLakeProviderAPI dataLakeProviderAPI;

    public ChatAnswer chat(String query) throws Exception, InvalidSpeechException {

        final List<ChatMessage> response = apiAiBotProviderAPI.getResponse(query);

        //final String responseTEMP = dataLakeProviderAPI.getResponse(query);

        return ChatAnswer.builder().status(200).message(response.toString()).build();
    }
}
