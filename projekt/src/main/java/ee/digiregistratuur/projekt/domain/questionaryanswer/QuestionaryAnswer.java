package ee.digiregistratuur.projekt.domain.questionaryanswer;

import ee.digiregistratuur.projekt.domain.questionary.Questionary;
import ee.digiregistratuur.projekt.domain.questionaryquestion.QuestionaryQuestion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "questionary_answer")
public class QuestionaryAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "yes")
    private Boolean yes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "questionary_id", nullable = false)
    private Questionary questionary;

    @ManyToOne(optional = false)
    @JoinColumn(name = "questionary_question_id", nullable = false)
    private QuestionaryQuestion questionaryQuestion;

}