package ee.digiregistratuur.projekt.service.login;

import lombok.Data;

import java.io.Serializable;

@Data
public class LogInResponse implements Serializable {
    private final String idCode;
    private final String firstName;
    private final String lastName;
    private final String address;
}
