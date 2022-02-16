package ee.digiregistratuur.projekt.domain.patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient findByIdCode(String idCode);

    boolean existsByIdCode(String idCode);



}