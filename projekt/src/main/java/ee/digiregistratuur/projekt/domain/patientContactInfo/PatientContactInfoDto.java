package ee.digiregistratuur.projekt.domain.patientContactInfo;

import ee.digiregistratuur.projekt.domain.patient.PatientDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class PatientContactInfoDto implements Serializable {
    private final Integer id;
    private final PatientDto patient;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String mobile;
    private final String address;
}
