package be.ing.api.chatbot.business;

import be.ing.api.chatbot.exception.InvalidSpeechException;
import be.ing.api.chatbot.model.ChatAnswer;
import be.ing.api.chatbot.service.DataLakeProviderAPI;
import com.google.cloud.dialogflow.v2.Context;
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

        //final List<ChatMessage> response = apiAiBotProviderAPI.getResponse(query);
        if (StringUtils.isBlank(sessionId)) {
            sessionId = createSessionID();
        }
        QueryResult queryResult = detectIntentTexts(PROJECT_ID, query, sessionId, locale.getLanguage());

        String whatElseRequest = StringUtils.EMPTY;
        if (queryResult.getOutputContextsList().size() > 0) {
            for (Context context : queryResult.getOutputContextsList()) {
                if (StringUtils.endsWithIgnoreCase(context.getName(), "end_of_flow")) {

                    QueryResult queryResultWhatElse = detectIntentTexts(PROJECT_ID, WHAT_ELSE_CAN_I_DO_FOR_YOU, sessionId, locale.getLanguage());
                    whatElseRequest = queryResultWhatElse.getFulfillmentText();

                }
            }
        }

        //String datalakeQuery = dataLakeProviderAPI.getResponse(query);

        return ChatAnswer.builder().status(200).message(queryResult.getFulfillmentText() + whatElseRequest).build();
    }

    protected String createSessionID() {
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey.toString();
    }
}
