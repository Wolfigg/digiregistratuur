package ee.digiregistratuur.projekt.patient;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class PatientController {

    @Resource
    private PatientService patientService;

    @GetMapping("/get/idCode")
    @Operation(summary = "Leiab kasutaja isikukoodi järgi")
    public void findPatientByIdCode(@RequestParam String idCode) {
        patientService.findPatientByIdCode(idCode);
    }

}
