package be.ing.api.chatbot.service.model.apiaibot.request;

import be.ing.api.chatbot.service.model.apiaibot.common.Context;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
@JsonInclude(Include.NON_NULL)
public class ApiAiBotRequest {

    private String lang;
    private String sessionId;
    private String query;
    private List<Context> contexts;
}
