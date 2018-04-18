package be.ing.api.chatbot.service.model.apiaibot.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metadata {
    private String intentId;
    private String webhookUsed;
    private String webhookForSlotFillingUsed;
    private String intentName;
}
