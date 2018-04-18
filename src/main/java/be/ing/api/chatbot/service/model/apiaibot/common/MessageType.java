package be.ing.api.chatbot.service.model.apiaibot.common;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public enum MessageType {

    MESSAGE_TYPE_UNKNOWN(-1, "Unknown message type"),
    MESSAGE_TYPE_TEXT(0, "simple_response");

    private int numericValue;
    private String textValue;

    MessageType(int numericValue, String textValue) {
        this.numericValue = numericValue;
        this.textValue = textValue;
    }

    public static MessageType getBy(String textValue) {
        for (MessageType mt : MessageType.values()) {
            if (StringUtils.equals(mt.textValue, textValue)) {
                return mt;
            }
        }
        return MESSAGE_TYPE_UNKNOWN;
    }
}
