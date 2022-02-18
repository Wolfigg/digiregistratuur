package ee.digiregistratuur.projekt.domain.patientcontactinfo;

import ee.digiregistratuur.projekt.domain.patient.PatientRepository;
import ee.digiregistratuur.projekt.infrastructure.exception.DataNotFoundException;
import ee.digiregistratuur.projekt.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class PatientContactInfoService {

    @Resource
    private PatientContactInfoRepository patientContactInfoRepository;

    @Resource
    private ValidationService validationService;

    public PatientContactInfo findPatientContactInfoById(String idCode) {
        Optional<PatientContactInfo> patientInfo = patientContactInfoRepository.findByPatientIdCode(idCode);

        validationService.validateIdCodeExists(patientInfo);
        PatientContactInfo result = patientInfo.get();

        return result;


    }



}
