package be.ing.api.chatbot.controller;

import be.ing.api.chatbot.business.AiLogic;
import be.ing.api.chatbot.exception.InvalidInputException;
import be.ing.api.chatbot.exception.InvalidSpeechException;
import be.ing.api.chatbot.model.ChatAnswer;
import com.frogermcs.gactions.ResponseBuilder;
import com.frogermcs.gactions.api.RequestHandler;
import com.frogermcs.gactions.api.request.RootRequest;
import com.frogermcs.gactions.api.response.RootResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class MainRequestHandler extends RequestHandler {

    @Autowired
    private AiLogic aiLogic;

    MainRequestHandler(RootRequest rootRequest) {
        super(rootRequest);
    }

    @Override
    public RootResponse getResponse() {
        String query = getRootRequest().inputs.get(0).rawInputs.get(0).query;
        try {
            validateInput(query);
            ChatAnswer chatAnswer = aiLogic.chat(query);
            return ResponseBuilder.tellResponse(chatAnswer.getMessage());
        } catch (InvalidInputException | InvalidSpeechException | Exception e ) {
            // Log (e.getMessage());
            return ResponseBuilder.tellResponse("Error while processing the request");
        }
    }


    private void validateInput(String query) throws InvalidInputException {
        int length = StringUtils.length(query);
        if ( length == 0 || length > 256) {
            throw new InvalidInputException("Query must be btw 0 and 256 caracters");
        }
    }
}