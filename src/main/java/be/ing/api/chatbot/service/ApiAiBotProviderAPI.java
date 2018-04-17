package be.ing.api.chatbot.service;

import be.ing.api.chatbot.model.ChatMessages.ChatMessage;
import be.ing.api.chatbot.model.ChatMessages.TextMessage;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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

    JsonParser jsonParser = new JsonParser();

    private final int RESPONSE_TIMEOUT                  = 10; // Seconds

    private final int MESSAGE_TEXT_TYPE                 = 0;
    private final int MESSAGE_IMAGE_TYPE                = 3;
    private final int MESSAGE_CARD_TYPE                 = 1;
    private final int MESSAGE_MULTIPLE_CHOICE           = 2;
    private final int MESSAGE_CUSTOM_TYPE               = 4;

    public List<ChatMessage> getResponse(String query) throws Exception {

        ReactorClientHttpConnector connector;
        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + API_DIALOGFLOW_TOKEN);

        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(buildRequestBody(query).toString(), headers);

        ResponseEntity<String> response = restTemplate.exchange("https://" + API_DIALOGFLOW_DOMAIN + API_DIALOGFLOW_PATH + "?v=" + API_DIALOGFLOW_VERSION, HttpMethod.POST, entity, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            JsonObject  jsonResponse = jsonParser.parse(response.getBody()).getAsJsonObject();
            JsonObject jsonResult = jsonResponse.getAsJsonObject("result");
            JsonObject jsonFulfillment = jsonResult.getAsJsonObject("fulfillment");

            return __createBotMessages(jsonFulfillment.getAsJsonArray("messages"));

        } else {
            //
            throw new Exception("Error while getting data from Dialogflow");
        }
    }

    private JsonObject buildRequestBody(String query) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("lang", "fr");
        jsonObject.addProperty("sessionId", __createSessionID() );
        jsonObject.addProperty("query", query);

        return jsonObject;
    }

    protected String __createSessionID() {
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey.toString();
    }

    protected List<ChatMessage> __createBotMessages(JsonArray messages) {

        List<ChatMessage> botMessages = null;

        if (messages==null) {
            //LOG.warn("No messages available in the bot response, unable to create not messages.");
            return botMessages;
        }

        try {
            int numMessages = messages.size();
            if (numMessages == 0) {
                //LOG.warn("Empty message list in bot response");
            }

            botMessages = new ArrayList<>(numMessages);

            for (JsonElement message : messages) {
                JsonObject msgObj = message.getAsJsonObject();

                int type = msgObj.get("type").getAsInt();

                ChatMessage botMessage = null;
                switch(type) {
                    case MESSAGE_TEXT_TYPE:
                        botMessage = __createTextMessageFrom(msgObj);
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

    protected TextMessage __createTextMessageFrom(JsonObject message) {
        // Speech is mandatory, so let it fail if not found
        String speech = message.get("speech").getAsString();
        if(!speech.isEmpty() || speech.equals("")) {
            return new TextMessage(speech);
        }

        return null;
    }
}
