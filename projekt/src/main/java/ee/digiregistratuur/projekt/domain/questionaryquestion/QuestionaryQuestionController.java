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
    public DiseaseQuestionaryResponse createQuestionaryByDiseaseId(@RequestParam Integer diseaseId,
                                                                   @RequestParam Integer patientId) {

        return questionaryQuestionService.getAllQuestionsByDiseaseId(diseaseId, patientId);
    }



//    @PutMapping("/add/new/question")
//    @Operation(summary = "Lisab küsimustikku uue küsimuse")
//    public void addNewQuestion (@RequestParam Integer diseaseId) {
//        questionaryQuestionService.addNewQuestion
//    }
}
