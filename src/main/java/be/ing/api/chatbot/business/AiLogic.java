package be.ing.api.chatbot.business;

import be.ing.api.chatbot.exception.InvalidSpeechException;
import be.ing.api.chatbot.model.ChatAnswer;
import be.ing.api.chatbot.service.DataLakeProviderAPI;
import com.google.cloud.dialogflow.v2.QueryResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.UUID;

import static be.ing.api.chatbot.service.ApiAiBotProviderAPIV2.detectIntentTexts;

@Component
public class AiLogic {

    public static final String PROJECT_ID = "datalake-chatbot";
    public static final String WHAT_ELSE_CAN_I_DO_FOR_YOU = "what else can I do for you";

    @Autowired
    private DataLakeProviderAPI dataLakeProviderAPI;

    public ChatAnswer chat(Locale locale, String sessionId, String query) throws Exception, InvalidSpeechException {

        if (StringUtils.isBlank(sessionId)) {
            sessionId = createSessionID();
        }
        QueryResult queryResult = detectIntentTexts(PROJECT_ID, query, sessionId, locale.getLanguage());

        String whatElseRequest = getWhatElseIntent(queryResult, sessionId, locale);

        // do the call to fourcast
        //String datalakeQuery = dataLakeProviderAPI.getResponse(query);

        return ChatAnswer.builder().status(200).message("API : " + queryResult.getFulfillmentText() + whatElseRequest).build();
    }

    private String getWhatElseIntent(QueryResult queryResult, String sessionId, Locale locale) throws Exception {
        if (StringUtils.equalsIgnoreCase(queryResult.getAction(), "end_of_flow")) {
            QueryResult queryResultWhatElse = detectIntentTexts(PROJECT_ID, WHAT_ELSE_CAN_I_DO_FOR_YOU, sessionId, locale.getLanguage());
            return " ... " + queryResultWhatElse.getFulfillmentText();
        }

        return StringUtils.EMPTY;
    }

    protected String createSessionID() {
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey.toString();
    }
}
