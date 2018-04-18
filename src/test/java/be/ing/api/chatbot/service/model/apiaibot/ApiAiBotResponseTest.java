package be.ing.api.chatbot.service.model.apiaibot;

import be.ing.api.chatbot.service.model.apiaibot.response.ApiAiBotResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class ApiAiBotResponseTest {


    @Test
    public void testMapping() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ApiAiBotResponse apiAiBotResponse = objectMapper.readValue(response, ApiAiBotResponse.class);
            apiAiBotResponse.getResult();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private String response = "{\n" +
            "  \"id\": \"5e208008-8009-4896-9952-00f5cb601cae\",\n" +
            "  \"timestamp\": \"2018-04-17T06:54:37.814Z\",\n" +
            "  \"lang\": \"en\",\n" +
            "  \"result\": {\n" +
            "    \"source\": \"agent\",\n" +
            "    \"resolvedQuery\": \"test\",\n" +
            "    \"action\": \"input.unknown\",\n" +
            "    \"actionIncomplete\": false,\n" +
            "    \"parameters\": {},\n" +
            "    \"contexts\": [],\n" +
            "    \"metadata\": {\n" +
            "      \"intentId\": \"d26d2be0-563f-4e65-9e79-dbba510390ab\",\n" +
            "      \"webhookUsed\": \"false\",\n" +
            "      \"webhookForSlotFillingUsed\": \"false\",\n" +
            "      \"intentName\": \"Default Fallback Intent\"\n" +
            "    },\n" +
            "    \"fulfillment\": {\n" +
            "      \"speech\": \"Say that again?\",\n" +
            "      \"messages\": [\n" +
            "        {\n" +
            "          \"type\": 0,\n" +
            "          \"speech\": \"One more time?\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"score\": 1.0\n" +
            "  },\n" +
            "  \"status\": {\n" +
            "    \"code\": 200,\n" +
            "    \"errorType\": \"success\",\n" +
            "    \"webhookTimedOut\": false\n" +
            "  },\n" +
            "  \"sessionId\": \"deabf795-6bf6-4b4c-8cff-b9902280798e\"\n" +
            "}";


}