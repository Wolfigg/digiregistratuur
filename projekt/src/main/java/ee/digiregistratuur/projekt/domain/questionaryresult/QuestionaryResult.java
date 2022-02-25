package ee.digiregistratuur.projekt.domain.questionaryresult;

import ee.digiregistratuur.projekt.domain.questionary.Questionary;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "questionary_result")
public class QuestionaryResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "questionary_id", nullable = false)
    private Questionary questionary;

    @Column(name = "positive", nullable = false)
    private Boolean positive = false;

    @Column(name = "comments")
    private String comments;

}