package ee.digiregistratuur.projekt.domain.questionaryresult;

import ee.digiregistratuur.projekt.domain.questionary.Questionary;
import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionaryResultDto implements Serializable {
    private final Integer id;
    private final Questionary questionary;
    private final Boolean positive;
    private final String comments;
}
