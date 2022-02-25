package ee.digiregistratuur.projekt.domain.questionary;

import ee.digiregistratuur.projekt.domain.disease.DiseaseDto;
import ee.digiregistratuur.projekt.domain.patient.PatientDto;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class QuestionaryDto implements Serializable {
    private final Integer id;
    private final LocalDate date;
    private final PatientDto patient;
    private final DiseaseDto disease;
    private final String status;
}
