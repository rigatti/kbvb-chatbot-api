package be.ing.api.chatbot.service.model.apiaibot.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Context {
    private String name;
    private HashMap<String, Object> parameters;
    private int lifespan;
}
