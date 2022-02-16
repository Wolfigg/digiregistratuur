package ee.digiregistratuur.projekt.service.updatecontact;

import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfo;
import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfoMapper;
import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfoRepository;
import ee.digiregistratuur.projekt.domain.patientcontactinfo.PatientContactInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UpdateContactService {

    @Resource
    private PatientContactInfoService patientContactInfoService;

    @Resource
    private PatientContactInfoMapper patientContactInfoMapper;

    @Resource
    private PatientContactInfoRepository patientContactInfoRepository;

    public void updateContactById(String idCode, UpdateContactRequest updateRequest) {
        PatientContactInfo contactInfo = patientContactInfoService.findPatientContactInfoById(idCode);
        patientContactInfoMapper.updateFromRequestToEntity(updateRequest,contactInfo);
        patientContactInfoRepository.save(contactInfo);
    }

}
