package ee.digiregistratuur.projekt.infrastructure.error;

import lombok.Data;

@Data
public class DigiregistratuurError {
    private String message;
    private Integer errorCode;
}
