package ee.digiregistratuur.projekt.domain.questionaryquestion;

import ee.digiregistratuur.projekt.domain.disease.Disease;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "questionary_question")
public class QuestionaryQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "disease_id", nullable = false)
    private Disease disease;

    @Column(name = "question", nullable = false)
    private String question;

}