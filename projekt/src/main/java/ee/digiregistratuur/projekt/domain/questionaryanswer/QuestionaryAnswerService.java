package ee.digiregistratuur.projekt.domain.questionaryanswer;

import ee.digiregistratuur.projekt.domain.questionary.Questionary;
import ee.digiregistratuur.projekt.domain.questionary.QuestionaryRepository;
import ee.digiregistratuur.projekt.domain.questionaryquestion.QuestionDto;
import ee.digiregistratuur.projekt.domain.questionaryquestion.QuestionaryQuestion;
import ee.digiregistratuur.projekt.domain.questionaryquestion.QuestionaryQuestionRepository;
import ee.digiregistratuur.projekt.domain.questionaryquestion.ResponseByDisease;
import ee.digiregistratuur.projekt.domain.questionaryresult.QuestionaryResult;
import ee.digiregistratuur.projekt.domain.questionaryresult.QuestionaryResultDto;
import ee.digiregistratuur.projekt.domain.questionaryresult.QuestionaryResultMapper;
import ee.digiregistratuur.projekt.domain.questionaryresult.QuestionaryResultRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service

public class QuestionaryAnswerService {

    @Resource
    private QuestionaryAnswerRepository questionaryAnswerRepository;

    @Resource
    private QuestionaryRepository questionaryRepository;

    @Resource
    private QuestionaryQuestionRepository questionaryQuestionRepository;

    @Resource
    private QuestionaryResultMapper questionaryResultMapper;

    @Resource
    private QuestionaryResultRepository questionaryResultRepository;


    public QuestionaryResultDto saveAnswers(ResponseByDisease responseByDisease) {
        // responseByDisease - questionaryId, List(questionary)questionDtos - (questionary)questionId, question, answer

        Questionary questionary = questionaryRepository.findById(responseByDisease.getQuestionaryId()).get();

        List<QuestionDto> questionDtos = responseByDisease.getQuestionDtos();
        for (QuestionDto questionDto : questionDtos) {
            Optional<QuestionaryQuestion> question = questionaryQuestionRepository.findById(questionDto.getQuestionId());

            QuestionaryAnswer questionaryAnswer = new QuestionaryAnswer();
            questionaryAnswer.setYes(questionDto.getAnswer());
            questionaryAnswer.setQuestionary(questionary);
            questionaryAnswer.setQuestionaryQuestion(question.get()); // diseaseId, question
            questionaryAnswerRepository.save(questionaryAnswer);
        }


        QuestionaryResult questionaryResult = new QuestionaryResult();
        questionaryResult.setQuestionary(questionary);
//      Boolean allowedToTesting = false;
        int count = 0;
        for (QuestionDto questionDto : questionDtos) {

            if (questionDto.getAnswer()) {
                count++;
            }
        }

        if (count >= 3) {
            questionaryResult.setPositive(true);
            questionaryResult.setComments("Registreeri aeg testimisele");
        } else {
            questionaryResult.setPositive(false);
            questionaryResult.setComments("Võtke ühedust perearstiga");
        }
        questionaryResultRepository.save(questionaryResult);

        QuestionaryResultDto questionaryResultDto = questionaryResultMapper.toQuestionaryResultDto(questionaryResult);
        return questionaryResultDto;
    }
}
