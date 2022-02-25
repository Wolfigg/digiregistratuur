package ee.digiregistratuur.projekt.domain.questionaryanswer;

import ee.digiregistratuur.projekt.domain.questionaryquestion.ResponseByDisease;
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
    @Operation(summary = "Annab küsimuste vastused")
    public void saveAnswers(@RequestBody ResponseByDisease responseByDisease) {
        questionaryAnswerService.saveAnswers(responseByDisease);
    }

}
