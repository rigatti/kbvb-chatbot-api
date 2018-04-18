package be.ing.api.chatbot.service;

import be.ing.api.chatbot.service.model.datalake.DataLakeRequest;
import be.ing.api.chatbot.service.model.datalake.DataLakeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class DataLakeProviderAPI {

    @Qualifier("API_FOURCAST_VERSION")
    @Autowired
    private String API_FOURCAST_VERSION;

    @Qualifier("API_FOURCAST_DOMAIN")
    @Autowired
    private String API_FOURCAST_DOMAIN;

    @Qualifier("API_FOURCAST_PATH")
    @Autowired
    private String API_FOURCAST_PATH;

    @Qualifier("API_FOURCAST_TOKEN")
    @Autowired
    private String API_FOURCAST_TOKEN;

    @Autowired
    RestTemplate restTemplate;

    ObjectMapper objectMapper = new ObjectMapper();

    public String getResponse(String query) throws Exception {

        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + API_FOURCAST_TOKEN);

        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(buildRequestBody(query), headers);

        ResponseEntity<String> response = restTemplate.exchange("https://" + API_FOURCAST_DOMAIN + API_FOURCAST_PATH + "?v=" + API_FOURCAST_VERSION, HttpMethod.POST, entity, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            ObjectMapper mapper = new ObjectMapper();
            DataLakeResponse dataLakeResponse = mapper.readValue(response.getBody(), DataLakeResponse.class);

            return dataLakeResponse.toString();

        } else {
            //
            throw new Exception("Error while getting data from Dialogflow");
        }
    }

    private String buildRequestBody(String query) throws JsonProcessingException {
        DataLakeRequest.DataLakeRequestBuilder requestBuilder = DataLakeRequest.builder();

        requestBuilder.id("xxxx");

        return objectMapper.writeValueAsString(requestBuilder.build());
    }
}
