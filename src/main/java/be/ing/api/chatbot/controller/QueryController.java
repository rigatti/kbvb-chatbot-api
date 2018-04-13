package be.ing.api.chatbot.controller;

import be.ing.api.chatbot.business.AiLogic;
import be.ing.api.chatbot.model.ChatAnswer;
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
            return aiLogic.chat(query);
        } catch (Exception e) {
                return ChatAnswer.builder().status(500).message(e.getMessage()).build();
        }
    }
}
