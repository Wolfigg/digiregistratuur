package ee.digiregistratuur.projekt.PatientContactInfo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientContactInfoService {

    @Resource
    private PatientContactInfoRepository patientContactInfoRepository;

    @Resource
    private PatientContactInfoMapper patientContactInfoMapper;

    public PatientContactInfoDto findPatientContactInfoById(String idCode) {
        PatientContactInfo patient = patientContactInfoRepository.findByPatientIdCode(idCode);
        PatientContactInfoDto patientContactInfoDto = patientContactInfoMapper.patientContactInfoToPatientContactInfoDto(patient);
        return patientContactInfoDto;
    }

    public void updatePatientContactInfoById(String idCode, PatientContactInfoDto patientContactInfo) {



    }
}
