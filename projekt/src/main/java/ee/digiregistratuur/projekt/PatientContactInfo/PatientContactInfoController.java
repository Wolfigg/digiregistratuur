package ee.digiregistratuur.projekt.PatientContactInfo;


import ee.digiregistratuur.projekt.RequestResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/patient/contact")

public class PatientContactInfoController {

    @Resource
    private PatientContactInfoService patientContactInfoService;

    @GetMapping("/get/by/id/code")
    @Operation(summary = "Leiab kasutaja kontaktandmed isikukoodi järgi")
    public PatientContactInfoDto findPatientContactInfoById(@RequestParam String idCode) {
        PatientContactInfoDto contactInfoById = patientContactInfoService.findPatientContactInfoById(idCode);
        return contactInfoById;
    }

    @PutMapping("/update/by/id/code")
    @Operation(summary = "Uuendab kontaktandmeid isikukoodi järgi")
    public RequestResponse updatePatientContactInfoById(@RequestParam String idCode,
                                                        @RequestBody PatientContactInfoDto patientContactInfo) {
        patientContactInfoService.updatePatientContactInfoById(idCode, patientContactInfo);

        return null;
    }
}
