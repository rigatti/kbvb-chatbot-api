package be.ing.api.chatbot.controller;

import be.ing.api.chatbot.business.AiLogic;
import be.ing.api.chatbot.exception.InvalidInputException;
import be.ing.api.chatbot.exception.InvalidSpeechException;
import be.ing.api.chatbot.model.ChatAnswer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private AiLogic aiLogic;

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
}
