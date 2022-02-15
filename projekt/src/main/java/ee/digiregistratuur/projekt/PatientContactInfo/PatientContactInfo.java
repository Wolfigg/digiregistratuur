package ee.digiregistratuur.projekt.PatientContactInfo;

import ee.digiregistratuur.projekt.patient.Patient;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "patient_contact_info")
public class PatientContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "mobile", nullable = false, length = 50)
    private String mobile;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

}