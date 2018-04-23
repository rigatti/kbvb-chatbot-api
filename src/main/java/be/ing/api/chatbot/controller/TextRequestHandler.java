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

public class TextRequestHandler extends RequestHandler {

    private AiLogic aiLogic;

    TextRequestHandler(RootRequest rootRequest, AiLogic aiLogic) {
        super(rootRequest);
        this.aiLogic = aiLogic;
    }

    @Override
    public RootResponse getResponse() {
        String query = getRootRequest().inputs.get(0).rawInputs.get(0).query;
        try {
            validateInput(query);
            ChatAnswer chatAnswer = aiLogic.chat(query);
            return ResponseBuilder.askResponse("Voici ma réponse, " + chatAnswer.getMessage());
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