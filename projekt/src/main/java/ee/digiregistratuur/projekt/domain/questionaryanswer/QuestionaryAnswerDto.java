package ee.digiregistratuur.projekt.domain.questionaryanswer;

import ee.digiregistratuur.projekt.domain.questionary.QuestionaryDto;
import ee.digiregistratuur.projekt.domain.questionaryquestion.QuestionaryQuestionDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionaryAnswerDto implements Serializable {
    private final Integer id;
    private final Boolean yes;
    private final QuestionaryDto questionary;
    private final QuestionaryQuestionDto questionaryQuestion;
}
