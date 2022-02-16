package ee.digiregistratuur.projekt.PatientContactInfo;

import ee.digiregistratuur.projekt.RequestResponse;
import ee.digiregistratuur.projekt.patient.PatientRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientContactInfoService {

    @Resource
    private PatientContactInfoRepository patientContactInfoRepository;

    @Resource
    private PatientContactInfoMapper patientContactInfoMapper;

    @Resource
    private PatientRepository patientRepository;

    public PatientContactInfoDto findPatientContactInfoById(String idCode) {
        PatientContactInfo patient = patientContactInfoRepository.findByPatientIdCode(idCode);
        PatientContactInfoDto patientContactInfoDto = patientContactInfoMapper.patientContactInfoToPatientContactInfoDto(patient);
        return patientContactInfoDto;
    }

    public RequestResponse updatePatientContactInfoById(String idCode, PatientContactInfoDtoRequest patientContactInfoDtoRequest) {
        RequestResponse response = new RequestResponse();
        if (patientRepository.existsByIdCode(idCode)) {
            PatientContactInfo patient = patientContactInfoRepository.findByPatientIdCode(idCode);
            patientContactInfoMapper.updatePatientContactInfoFromPatientContactInfoDtoRequest(patientContactInfoDtoRequest, patient);
            patientContactInfoRepository.save(patient);
            response.setMessage(idCode + " isikukoodiga patsiendi andmed uuendatud");

        } else{
                response.setError("Andmete uuendamisel viga");
        }
        return response;


    }
}
