package be.ing.api.chatbot.controller;

import be.ing.api.chatbot.business.AiLogic;
import be.ing.api.chatbot.exception.InvalidInputException;
import be.ing.api.chatbot.exception.InvalidSpeechException;
import be.ing.api.chatbot.model.ChatAnswer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frogermcs.gactions.AssistantActions;
import com.frogermcs.gactions.api.StandardIntents;
import com.frogermcs.gactions.api.request.RootRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "", produces = "application/json")
    public ChatAnswer get(@RequestParam String query) {
        try {
            validateInput(query);
            return aiLogic.chat(query);
        } catch (InvalidInputException | InvalidSpeechException | Exception e ) {
            // Log (e.getMessage());
            return ChatAnswer.builder().status(500).message("Error while processing the request").build();
        }
    }

    private void validateInput(String query) throws InvalidInputException {
        int length = StringUtils.length(query);
        if ( length == 0 || length > 256) {
            throw new InvalidInputException("Query must be btw 0 and 256 caracters");
        }
    }

    @RequestMapping(value="/actions", produces = "application/json", method = RequestMethod.POST)
    public void callAction(HttpServletRequest request, HttpServletResponse response) {
        AssistantActions assistantActions =
                new AssistantActions.Builder(new AppEngineResponseHandler(response))
                        .addRequestHandlerFactory(StandardIntents.MAIN, new MainRequestHandlerFactory())
//                        .addRequestHandlerFactory(StandardIntents.TEXT, new TextRequestHandlerFactory())
//                        .addRequestHandlerFactory(StandardIntents.PERMISSION, new MyPermissionRequestHandlerFactory())
                        .build();


        RootRequest rootRequest = null;
        try {

            String requestBody = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            rootRequest = objectMapper.readValue(requestBody, RootRequest.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assistantActions.handleRequest(rootRequest);
    }

    private RootRequest parseActionRequest(HttpServletRequest request) {

        return null;
    }


}
