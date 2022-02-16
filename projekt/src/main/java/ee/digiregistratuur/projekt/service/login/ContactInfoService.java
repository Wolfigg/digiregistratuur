package ee.digiregistratuur.projekt.service.login;

import ee.digiregistratuur.projekt.domain.patientContactInfo.PatientContactInfo;
import ee.digiregistratuur.projekt.domain.patientContactInfo.PatientContactInfoMapper;
import ee.digiregistratuur.projekt.domain.patientContactInfo.PatientContactInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContactInfoService {

    @Resource
    private PatientContactInfoService patientContactInfoService;

    @Resource
    private PatientContactInfoMapper patientContactInfoMapper;

    public ContactInfoResponse getContactInfoByIdCode(String idCode) {
        PatientContactInfo contactInfo = patientContactInfoService.findPatientContactInfoById(idCode);
        ContactInfoResponse response = patientContactInfoMapper.mapInfoToResponse(contactInfo);
        return response;
    }
}
