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
    public ResponseByDisease getQuestionaryByDiseaseId(@RequestParam Integer diseaseId,
                                                       @RequestParam Integer patientId) {
        return questionaryQuestionService.getAllQuestionsByDiseaseId(diseaseId, patientId);
    }

    @PostMapping("/add/new/question/by/disease/id")
    @Operation(summary = "Lisab küsimustikku uue küsimuse haiguse id järgi")
    public void addNewQuestionByDiseaseId(@RequestParam Integer diseaseID, @RequestParam String question) {
        questionaryQuestionService.addNewQuestion(diseaseID, question);
    }

    @DeleteMapping("/delete/question/by/id")
    @Operation(summary = "Kustutab kysimuse kysimuse id järgi")
    public void deleteQuestionByQuestionId(@RequestParam Integer id) {
        questionaryQuestionService.deleteQuestion(id);
    }

}
