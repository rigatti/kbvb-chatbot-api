package be.ing.api.chatbot.service;

import com.google.cloud.dialogflow.v2.*;

public class ApiAiBotProviderAPIV2 {

    public static QueryResult detectIntentTexts(String projectId, String query, String sessionId,
                                         String languageCode) throws Exception {
        // Instantiates a client
        try (SessionsClient sessionsClient = SessionsClient.create()) {
            // Set the session name using the sessionId (UUID) and projectID (my-project-id)
            SessionName session = SessionName.of(projectId, sessionId);
            System.out.println("Session Path: " + session.toString());

            // Set the text (hello) and language code (en-US) for the query
            TextInput.Builder textInput = TextInput.newBuilder().setText(query).setLanguageCode(languageCode);

            // Build the query with the TextInput
            QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();

            // Performs the detect intent request
            DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);

            // Display the query result
            QueryResult queryResult = response.getQueryResult();

            System.out.println("====================");
            System.out.format("Query Text: '%s'\n", queryResult.getQueryText());
            System.out.format("Detected Intent: %s (confidence: %f)\n",
                    queryResult.getIntent().getDisplayName(), queryResult.getIntentDetectionConfidence());
            System.out.format("Fulfillment Text: '%s'\n", queryResult.getFulfillmentText());
            System.out.format("Context : '%s'\n", queryResult.getOutputContextsList());
            System.out.format("sessionId: '%s'\n", session.getSession());

            return queryResult;

        }
    }


}
