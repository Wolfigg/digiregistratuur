package ee.digiregistratuur.projekt.domain.questionaryanswer;

import ee.digiregistratuur.projekt.domain.questionaryquestion.QuestionaryQuestion;
import ee.digiregistratuur.projekt.domain.questionaryresult.Questionary;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "questionaire_answer")
public class QuestionaryAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "yes")
    private Boolean yes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "questionaire_id", nullable = false)
    private Questionary questionaire;

    @ManyToOne(optional = false)
    @JoinColumn(name = "questionaire_question_id", nullable = false)
    private QuestionaryQuestion questionaireQuestion;

}