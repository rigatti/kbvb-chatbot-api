package be.ing.api.chatbot.service.model.apiaibot.response;

import be.ing.api.chatbot.service.model.apiaibot.common.Context;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    private String source;
    private String resolvedQuery;
    private String action;
    private boolean actionIncomplete;
    private HashMap<String, Object> parameters;
    private List<Context> contexts;
    private Metadata metadata;
    private Fulfillment fulfillment;
    private String score;
}
