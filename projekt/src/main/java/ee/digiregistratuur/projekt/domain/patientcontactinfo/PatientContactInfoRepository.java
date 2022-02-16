package ee.digiregistratuur.projekt.domain.patientcontactinfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientContactInfoRepository extends JpaRepository<PatientContactInfo, Integer> {
    @Query("select p from PatientContactInfo p where p.patient.idCode = ?1")
    PatientContactInfo findByPatientIdCode(String idCode);



}