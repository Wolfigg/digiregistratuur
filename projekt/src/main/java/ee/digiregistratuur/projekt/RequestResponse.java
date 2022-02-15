package ee.digiregistratuur.projekt;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestResponse implements Serializable {
    private String message;
    private String error;
}
