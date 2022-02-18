package ee.digiregistratuur.projekt.infrastructure.exception;

import lombok.Data;

@Data
public class DigiregistratuurException extends RuntimeException {
    private String message;
    private Integer errorCode;

    public DigiregistratuurException(String message, Integer errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
