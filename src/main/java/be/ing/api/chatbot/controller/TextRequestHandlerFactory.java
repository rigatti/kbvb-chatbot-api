package be.ing.api.chatbot.controller;

import be.ing.api.chatbot.business.AiLogic;
import com.frogermcs.gactions.api.RequestHandler;
import com.frogermcs.gactions.api.request.RootRequest;

public class TextRequestHandlerFactory extends RequestHandler.Factory {

    AiLogic aiLogic;

    public TextRequestHandlerFactory(AiLogic aiLogic) {
        this.aiLogic = aiLogic;
    }

    @Override
    public RequestHandler create(RootRequest rootRequest) {
        return new TextRequestHandler(rootRequest, aiLogic);
    }
}