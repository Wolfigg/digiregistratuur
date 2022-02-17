package ee.digiregistratuur.projekt.service.login;

import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfo;
import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfoMapper;
import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogInService {

    @Resource
    private PatientContactInfoService patientContactInfoService;

    @Resource
    private PatientContactInfoMapper patientContactInfoMapper;

    public LogInResponse logInByIdCode(String idCode) {
        PatientContactInfo contactInfo = patientContactInfoService.findPatientContactInfoById(idCode);
        LogInResponse response = patientContactInfoMapper.mapInfoToResponse(contactInfo);
        return response;
    }
}
