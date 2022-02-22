package ee.digiregistratuur.projekt.domain.patient;

import ee.digiregistratuur.projekt.domain.patientcontactinfo.Patient;
import ee.digiregistratuur.projekt.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class PatientService {

    @Resource
    private PatientRepository patientRepository;

    @Resource
    private ValidationService validationService;

    public Patient findPatientByIdCode(String idCode) {
        Patient patient = patientRepository.findByIdCode(idCode);
        return patient;
    }

    public Patient getValidPatient(String idCode) {
        Optional<Patient> patient = Optional.ofNullable(patientRepository.findByIdCode(idCode));
        validationService.validateIdCodeExists(patient);
        return patient.get();
    }

}

