package be.ing.api.chatbot.service.model.apiaibot;

import java.util.List;

public class Result {
    private String source;
    private String resolvedQuery;
    private String action;
    private boolean actionIncomplete;
    private String parameters;
    private List<Context> contexts;
    private Metadata metadata;
    private Fulfillment fulfillment;
    private String score;
}
