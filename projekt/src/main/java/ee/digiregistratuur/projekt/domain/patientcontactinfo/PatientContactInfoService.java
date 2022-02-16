package ee.digiregistratuur.projekt.domain.patientcontactinfo;

import ee.digiregistratuur.projekt.domain.patient.PatientRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientContactInfoService {

    @Resource
    private PatientContactInfoRepository patientContactInfoRepository;

    @Resource
    private PatientRepository patientRepository;

    public PatientContactInfo findPatientContactInfoById(String idCode) {
        if (patientRepository.existsByIdCode(idCode)) {
            PatientContactInfo patientInfo = patientContactInfoRepository.findByPatientIdCode(idCode);
            return patientInfo;
        }else {
            return null;
        }
    }

}
