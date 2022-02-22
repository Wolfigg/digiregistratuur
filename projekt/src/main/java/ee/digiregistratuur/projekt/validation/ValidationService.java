package ee.digiregistratuur.projekt.validation;

import ee.digiregistratuur.projekt.domain.patient.Patient;
import ee.digiregistratuur.projekt.infrastructure.exception.DataNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValidationService {

    public static final String ID_CODE_NOT_EXISTS = "Viga sisestusel. Sellise isikukoodiga kasutajat ei eksisteeri";
    public static final int ID_CODE_NOT_EXISTS_ERROR_CODE = 666;

    public void validateIdCodeExists(Optional<Patient> patientInfo) {
        if (patientInfo.isEmpty()) {
            throw new DataNotFoundException(ID_CODE_NOT_EXISTS, ID_CODE_NOT_EXISTS_ERROR_CODE);
        }
    }


}
