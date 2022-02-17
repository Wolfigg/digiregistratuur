package ee.digiregistratuur.projekt.domain.questionaryquestion;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionaryQuestionService {
    @Resource
    private QuestionaryQuestionRepository questionaryQuestionRepository;

    @Resource
    private QuestionaryQuestionMapper questionaryQuestionMapper;

    public List<QuestionaryQuestionResponse> getAllQuestionsByDiseaseId(Integer diseaseId) {
        List<QuestionaryQuestion> questions = questionaryQuestionRepository.findByDiseaseId(diseaseId);
        List<QuestionaryQuestionResponse> responses = questionaryQuestionMapper.toQuestionsResponses(questions);
        return responses;
    }
}
