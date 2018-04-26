package be.ing.api.chatbot.controller;

import be.ing.api.chatbot.business.AiLogic;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frogermcs.gactions.AssistantActions;
import com.frogermcs.gactions.api.StandardIntents;
import com.frogermcs.gactions.api.request.RootRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private AiLogic aiLogic;

    private ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value="/actions", produces = "application/json", method = RequestMethod.POST)
    public void callAction(HttpServletRequest request, HttpServletResponse response) {
        AssistantActions assistantActions =
                new AssistantActions.Builder(new AppEngineResponseHandler(response))
                        .addRequestHandlerFactory(StandardIntents.MAIN, new MainRequestHandlerFactory(aiLogic))
                        .addRequestHandlerFactory(StandardIntents.TEXT, new TextRequestHandlerFactory(aiLogic))
//                        .addRequestHandlerFactory(StandardIntents.PERMISSION, new MyPermissionRequestHandlerFactory())
                        .build();

        RootRequest rootRequest = null;
        try {
            String requestBody = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            rootRequest = objectMapper.readValue(requestBody, RootRequest.class);

            assistantActions.handleRequest(rootRequest);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
