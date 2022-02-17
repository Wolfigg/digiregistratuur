package ee.digiregistratuur.projekt.domain.questionaryquestion;

import lombok.Data;

import java.util.List;

@Data
public class DiseaseQuestionaryResponse {
    private Integer questionaryId;
    private List<QuestionDto> questionDtos;


}
