package ee.digiregistratuur.projekt.domain.patient;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientService {

    @Resource
    private PatientRepository patientRepository;

    public Patient findPatientByIdCode(String idCode) {
        Patient patient = patientRepository.findByIdCode(idCode);
        return patient;
    }

}
