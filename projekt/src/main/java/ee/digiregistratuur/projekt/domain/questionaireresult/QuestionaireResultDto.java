package ee.digiregistratuur.projekt.domain.questionaireresult;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionaireResultDto implements Serializable {
    private final Integer id;
    private final Questionaire questionaire;
    private final Boolean positive;
    private final String comments;
}
