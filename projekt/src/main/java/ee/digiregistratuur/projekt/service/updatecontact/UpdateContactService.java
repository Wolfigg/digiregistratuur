package ee.digiregistratuur.projekt.service.updatecontact;

import ee.digiregistratuur.projekt.domain.patientContactInfo.PatientContactInfo;
import ee.digiregistratuur.projekt.domain.patientContactInfo.PatientContactInfoMapper;
import ee.digiregistratuur.projekt.domain.patientContactInfo.PatientContactInfoRepository;
import ee.digiregistratuur.projekt.domain.patientContactInfo.PatientContactInfoService;
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
