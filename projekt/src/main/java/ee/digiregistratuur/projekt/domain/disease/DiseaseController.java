package ee.digiregistratuur.projekt.domain.disease;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/disease")
public class DiseaseController {

    @Resource
    private DiseaseService diseaseService;

    @GetMapping("/get/all")
    @Operation(summary = "Leiab kõigi haiguste listi")
    public List<DiseaseResponse> getDiseaseList() {
        return diseaseService.getDiseaseList();
    }

    @PostMapping("/add/new")
    @Operation(summary = "Lisab uue haiguse")
    public void addNewDisease(@RequestBody DiseaseRequest diseaseRequest) {
        diseaseService.addNewDisease(diseaseRequest);
    }

//    @DeleteMapping("/delete/by/disease/id") //pooleli
//    @Operation(summary = "Kustutab haiguse id järgi")
//    public void deleteDisease(@RequestBody Integer id){
//        diseaseService.deleteDisease(id);
//    }
}
