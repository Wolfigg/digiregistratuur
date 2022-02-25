package ee.digiregistratuur.projekt.domain.questionaryanswer;

import ee.digiregistratuur.projekt.domain.questionary.Questionary;
import ee.digiregistratuur.projekt.domain.questionary.QuestionaryRepository;
import ee.digiregistratuur.projekt.domain.questionaryquestion.*;
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
    private QuestionaryQuestionMapper questionaryQuestionMapper;

    @Resource
    private QuestionaryQuestionRepository questionaryQuestionRepository;

    public void saveAnswers(ResponseByDisease responseByDisease) {
        // responseByDisease - questionaryId, List(questionary)questionDtos - (questionary)questionId, question, answer

        Questionary questionary = questionaryRepository.findById(responseByDisease.getQuestionaryId()).get();
        Boolean allowedToTesting = false;
        List<QuestionDto> questionDtos = responseByDisease.getQuestionDtos();
        for (QuestionDto questionDto : questionDtos) {
            Optional<QuestionaryQuestion> question = questionaryQuestionRepository.findById(questionDto.getQuestionId());

            QuestionaryAnswer questionaryAnswer = new QuestionaryAnswer();
            questionaryAnswer.setYes(questionDto.getAnswer());
            questionaryAnswer.setQuestionary(questionary);
            questionaryAnswer.setQuestionaryQuestion(question.get()); // diseaseId, question
            questionaryAnswerRepository.save(questionaryAnswer);
        }


    }
}
