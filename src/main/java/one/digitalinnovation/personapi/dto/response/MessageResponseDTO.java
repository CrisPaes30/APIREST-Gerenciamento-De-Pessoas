package one.digitalinnovation.personapi.dto.response;



import lombok.Builder;
import lombok.Data;
import org.apache.logging.log4j.message.Message;

@Data

public class MessageResponseDTO {

    private String message;

    public static Message builder() {
        return builder();
    }
}
