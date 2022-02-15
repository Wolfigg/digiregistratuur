package ee.digiregistratuur.projekt.PatientContactInfo;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/patient/contact")

public class PatientContactInfoController {

    @Resource
    private PatientContactInfoService patientContactInfoService;

    @GetMapping("/get/by/idcode")
    @Operation(summary = "Leiab kasutaja kontaktandmed isikukoodi järgi")
    public PatientContactInfoDto findPatientContactInfoById(@RequestParam String idCode) {
        PatientContactInfoDto contactInfoById = patientContactInfoService.findPatientContactInfoById(idCode);
        return contactInfoById;
    }

}
