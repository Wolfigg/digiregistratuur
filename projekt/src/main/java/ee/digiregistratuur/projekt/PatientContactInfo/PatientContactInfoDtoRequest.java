package ee.digiregistratuur.projekt.PatientContactInfo;

import lombok.Data;

import java.io.Serializable;

@Data
public class PatientContactInfoDtoRequest implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String mobile;
    private final String address;
}
