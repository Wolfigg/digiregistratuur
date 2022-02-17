package ee.digiregistratuur.projekt.domain.questionaryquestion;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionDto implements Serializable {
    private final Integer questionId;
    private final String question;
    private final Boolean answer;

}
