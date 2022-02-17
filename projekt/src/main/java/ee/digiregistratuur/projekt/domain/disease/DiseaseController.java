package ee.digiregistratuur.projekt.domain.disease;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
