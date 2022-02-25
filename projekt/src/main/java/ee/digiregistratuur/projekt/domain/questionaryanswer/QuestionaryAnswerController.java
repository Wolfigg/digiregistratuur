package ee.digiregistratuur.projekt.domain.questionaryanswer;

import ee.digiregistratuur.projekt.domain.questionaryquestion.ResponseByDisease;
import ee.digiregistratuur.projekt.domain.questionaryresult.QuestionaryResultDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class QuestionaryAnswerController {

    @Resource
    private QuestionaryAnswerService questionaryAnswerService;

    @PostMapping("/save/questionary/answer")
    @Operation(summary = "Salvestab küsimuste vastused")
    public QuestionaryResultDto saveAnswers(@RequestBody ResponseByDisease responseByDisease) {
        return questionaryAnswerService.saveAnswers(responseByDisease);

    }

}
