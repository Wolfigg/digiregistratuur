package ee.digiregistratuur.projekt.domain.questionaryanswer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionaryAnswerRepository extends JpaRepository<QuestionaryAnswer, Integer> {
    @Query("select q from QuestionaryAnswer q where q.questionary.id = ?1")
    List<QuestionaryAnswer> findByQuestionaryId(Integer id);


}