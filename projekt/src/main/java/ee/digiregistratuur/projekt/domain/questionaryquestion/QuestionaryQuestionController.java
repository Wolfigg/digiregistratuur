package ee.digiregistratuur.projekt.domain.questionaryquestion;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/questionary/question")

public class QuestionaryQuestionController {

    @Resource
    private QuestionaryQuestionService questionaryQuestionService;

    @GetMapping("/get/all/by/disease/id")
    @Operation(summary = "Leiab kõik küsimustiku küsimused haiguse id järgi")
    public ResponseByDisease createQuestionaryByDiseaseId(@RequestParam Integer diseaseId,
                                                          @RequestParam Integer patientId) {
        return questionaryQuestionService.getAllQuestionsByDiseaseId(diseaseId, patientId);
    }

    @PostMapping("/add/new/question") //ei ole vajalik, aga ei toimi
    @Operation(summary = "Lisab küsimustikku uue küsimuse")
    public void addNewQuestionByDiseaseId(@RequestParam RequestAddQuestion requestAddQuestion) {
        questionaryQuestionService.addNewQuestion(requestAddQuestion);
    }
}
