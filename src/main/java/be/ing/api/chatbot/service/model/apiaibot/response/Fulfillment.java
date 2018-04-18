package be.ing.api.chatbot.service.model.apiaibot.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fulfillment {

    private String speech;
    private List<Message> messages;
}
