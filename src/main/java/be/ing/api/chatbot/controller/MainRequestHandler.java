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

import java.util.Locale;

public class MainRequestHandler extends RequestHandler {

    private AiLogic aiLogic;

    MainRequestHandler(RootRequest rootRequest, AiLogic aiLogic) {
        super(rootRequest);
        this.aiLogic = aiLogic;
    }

    @Override
    public RootResponse getResponse() {
        String query = getRootRequest().inputs.get(0).rawInputs.get(0).query;
        String sessionId = getRootRequest().conversation.conversationId;
        Locale locale = getRootRequest().user.getLocale();

        try {
            validateInput(query);
            ChatAnswer chatAnswer = aiLogic.chat(locale, sessionId, query);
            return ResponseBuilder.askResponse(chatAnswer.getMessage());
        } catch (InvalidInputException | InvalidSpeechException | Exception e ) {
            e.printStackTrace();
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