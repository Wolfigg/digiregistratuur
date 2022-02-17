package ee.digiregistratuur.projekt.domain.patient;

import lombok.Data;

import java.io.Serializable;

@Data
public class PatientDto implements Serializable {
    private final Integer id;
    private final String idCode;
}