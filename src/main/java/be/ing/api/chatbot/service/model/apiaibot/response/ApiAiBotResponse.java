package be.ing.api.chatbot.service.model.apiaibot.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAiBotResponse {

    private String id;
    private String timestamp;
    private String lang;
    private Result result;
    private Status status;
    private String sessionId;

}
