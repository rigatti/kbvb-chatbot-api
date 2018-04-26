package be.ing.api.chatbot.controller;

import be.ing.api.chatbot.business.AiLogic;
import com.frogermcs.gactions.api.RequestHandler;
import com.frogermcs.gactions.api.request.RootRequest;

public class MainRequestHandlerFactory extends RequestHandler.Factory {

    AiLogic aiLogic;

    public MainRequestHandlerFactory(AiLogic aiLogic) {
        this.aiLogic = aiLogic;
    }

    @Override
    public RequestHandler create(RootRequest rootRequest) {
        return new MainRequestHandler(rootRequest, aiLogic);
    }
}