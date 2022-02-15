package ee.digiregistratuur.projekt.patient;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientService {

    @Resource
    private PatientRepository patientRepository;


    public void findPatientByIdCode(String idCode) {
        patientRepository.findByIdCode(idCode);
    }

}
