package ee.digiregistratuur.projekt.domain.questionaryquestion;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionaryQuestionResponse implements Serializable {
    private final Integer diseaseId;
    private final String question;
}
