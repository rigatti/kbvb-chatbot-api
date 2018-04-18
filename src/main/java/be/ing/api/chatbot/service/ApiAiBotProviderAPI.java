package be.ing.api.chatbot.service;

import be.ing.api.chatbot.exception.InvalidSpeechException;
import be.ing.api.chatbot.model.ChatMessages.ChatMessage;
import be.ing.api.chatbot.model.ChatMessages.TextMessage;
import be.ing.api.chatbot.service.model.apiaibot.common.Context;
import be.ing.api.chatbot.service.model.apiaibot.common.MessageType;
import be.ing.api.chatbot.service.model.apiaibot.request.ApiAiBotRequest;
import be.ing.api.chatbot.service.model.apiaibot.response.ApiAiBotResponse;
import be.ing.api.chatbot.service.model.apiaibot.response.Fulfillment;
import be.ing.api.chatbot.service.model.apiaibot.response.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

public class ApiAiBotProviderAPI {

    @Qualifier("API_DIALOGFLOW_VERSION")
    @Autowired
    private String API_DIALOGFLOW_VERSION;

    @Qualifier("API_DIALOGFLOW_DOMAIN")
    @Autowired
    private String API_DIALOGFLOW_DOMAIN;

    @Qualifier("API_DIALOGFLOW_PATH")
    @Autowired
    private String API_DIALOGFLOW_PATH;

    @Qualifier("API_DIALOGFLOW_TOKEN")
    @Autowired
    private String API_DIALOGFLOW_TOKEN;

    @Autowired
    RestTemplate restTemplate;

    ObjectMapper objectMapper = new ObjectMapper();

    private final int RESPONSE_TIMEOUT                  = 10; // Seconds

    private final int MESSAGE_TEXT_TYPE                 = 0;
    private final int MESSAGE_IMAGE_TYPE                = 3;
    private final int MESSAGE_CARD_TYPE                 = 1;
    private final int MESSAGE_MULTIPLE_CHOICE           = 2;
    private final int MESSAGE_CUSTOM_TYPE               = 4;

    public List<ChatMessage> getResponse(String query) throws Exception, InvalidSpeechException {

        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + API_DIALOGFLOW_TOKEN);

        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(buildRequestBody(query), headers);

        ResponseEntity<String> response = restTemplate.exchange("https://" + API_DIALOGFLOW_DOMAIN + API_DIALOGFLOW_PATH + "?v=" + API_DIALOGFLOW_VERSION, HttpMethod.POST, entity, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            ObjectMapper mapper = new ObjectMapper();
            ApiAiBotResponse apiAiBotResponse = mapper.readValue(response.getBody(), ApiAiBotResponse.class);
            Fulfillment fulfillment = apiAiBotResponse.getResult().getFulfillment();

            return createBotMessages(fulfillment.getMessages());

        } else {
            throw new Exception("Error while getting data from Dialogflow");
        }
    }

    private String buildRequestBody(String query) throws JsonProcessingException {
        ApiAiBotRequest.ApiAiBotRequestBuilder requestBuilder = ApiAiBotRequest.builder();

        Context context = new Context();
        context.setName("PromptedWelcome");
        context.setLifespan(5);

        requestBuilder.lang("fr");
        requestBuilder.sessionId(createSessionID());
        requestBuilder.query(query);
        requestBuilder.contexts(Arrays.asList(context));

        return objectMapper.writeValueAsString(requestBuilder.build());
    }

    protected String createSessionID() {
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey.toString();
    }

    protected List<ChatMessage> createBotMessages(List<Message> messages) throws InvalidSpeechException {

        List<ChatMessage> botMessages = Collections.EMPTY_LIST;

        if (messages == null) {
            //LOG.warn("No messages available in the bot response, unable to create not messages.");
            return botMessages;
        }

        try {
            int numMessages = messages.size();
            if (numMessages == 0) {
                //LOG.warn("Empty message list in bot response");
            }

            botMessages = new ArrayList<>(numMessages);

            for (Message message : messages) {


                int type = mapTypes(message.getType());

                ChatMessage botMessage = null;
                switch(type) {
                    case MESSAGE_TEXT_TYPE :
                        botMessage = createTextMessageFrom(message);
                        break;
//                    case MESSAGE_IMAGE_TYPE:
//                        botMessage = __createImageMessageFrom(msgObj);
//                        break;
//                    case MESSAGE_CARD_TYPE:
//                        botMessage = __createCardMessageFrom(msgObj);
//                        break;
//                    case MESSAGE_MULTIPLE_CHOICE:
//                        botMessage = __createMultipleChoiceMessageFrom(msgObj);
//                        break;
//                    case MESSAGE_CUSTOM_TYPE:
//                        botMessage = __createCustomMessageFrom(msgObj);
//                        break;
                    default:
                        //LOG.error("Unknown message type {}, unable to create bot message", type);
                }

                if (botMessage != null) {
                    botMessages.add(botMessage);
                } else {
                    //LOG.error("Unable to create message of type {}, skipping ...", type);
                }
            }
        } catch (Exception e) {
            //LOG.error("An exception occurred, unable to create bot message(s)", e);
        }

        return botMessages;
    }

    private int mapTypes(String type) {
        if (StringUtils.isNumeric(type)) {
            return Integer.parseInt(type);
        } else {
            return MessageType.MESSAGE_TYPE_UNKNOWN.getNumericValue();//MessageType.getBy(type).getNumericValue();
        }
    }

    protected TextMessage createTextMessageFrom(Message message) throws InvalidSpeechException {

        String speech = message.getSpeech();
//        if ( StringUtils.isEmpty(speech) ) {
//            speech = message.getTextToSpeech();
//        }

        if ( StringUtils.isNotEmpty(speech) ) {
            return new TextMessage(speech);
        } else {
            throw new InvalidSpeechException("Error while getting the speech value for text message. Can not be empty.");
        }
    }
}
