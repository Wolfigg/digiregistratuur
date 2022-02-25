package ee.digiregistratuur.projekt.domain.questionaryresult;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionaryResultDto implements Serializable {
    private final Boolean positive;
    private final String comments;
}
