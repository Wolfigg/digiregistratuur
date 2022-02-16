package ee.digiregistratuur.projekt.domain.patientContactInfo;

import ee.digiregistratuur.projekt.RequestResponse;
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

//    public RequestResponse updatePatientContactInfoById(String idCode, PatientContactInfoDtoRequest patientContactInfoDtoRequest) {
//        RequestResponse response = new RequestResponse();
//        if (patientRepository.existsByIdCode(idCode)) {
//            PatientContactInfo patient = patientContactInfoRepository.findByPatientIdCode(idCode);
//            patientContactInfoMapper.updatePatientContactInfoFromPatientContactInfoDtoRequest(patientContactInfoDtoRequest, patient);
//            patientContactInfoRepository.save(patient);
//            response.setMessage(idCode + " isikukoodiga patsiendi andmed uuendatud");
//
//        } else{
//                response.setError("Andmete uuendamisel viga");
//        }
//        return response;
//
//
//    }
}
