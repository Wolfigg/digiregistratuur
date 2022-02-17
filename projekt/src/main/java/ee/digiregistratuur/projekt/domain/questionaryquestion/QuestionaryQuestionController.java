package ee.digiregistratuur.projekt.domain.questionaryquestion;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/questionary/question")

public class QuestionaryQuestionController {

    @Resource
    private QuestionaryQuestionService questionaryQuestionService;

    @GetMapping("/get/all/by/disease/id")
    @Operation(summary = "Leiab kõik küsimustiku küsimused haiguse id järgi")
    public List<QuestionaryQuestionResponse> getAllQuestionsByDiseaseId(@RequestParam Integer diseaseId) {
        return questionaryQuestionService.getAllQuestionsByDiseaseId(diseaseId);
    }
}
