package ee.digiregistratuur.projekt.domain.questionaryquestion;

import ee.digiregistratuur.projekt.domain.disease.DiseaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionaryQuestionDto implements Serializable {
    private final Integer id;
    private final DiseaseDto disease;
    private final String question;
}
