package ee.digiregistratuur.projekt.domain.questionary;

import ee.digiregistratuur.projekt.domain.disease.Disease;
import ee.digiregistratuur.projekt.domain.patient.Patient;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "questionary")
public class Questionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(optional = false)
    @JoinColumn(name = "disease_id", nullable = false)
    private Disease disease;

    @Column(name = "status", nullable = false)
    private String status;

}