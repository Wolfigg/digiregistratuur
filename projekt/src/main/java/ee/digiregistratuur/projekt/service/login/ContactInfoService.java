package ee.digiregistratuur.projekt.service.login;

import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfo;
import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfoMapper;
import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfoService;
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
