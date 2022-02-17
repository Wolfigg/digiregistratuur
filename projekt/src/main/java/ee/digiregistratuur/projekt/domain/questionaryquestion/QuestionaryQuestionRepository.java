package ee.digiregistratuur.projekt.domain.questionaryquestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionaryQuestionRepository extends JpaRepository<QuestionaryQuestion, Integer> {
    @Query("select q from QuestionaryQuestion q where q.disease.id = ?1")
    List<QuestionaryQuestion> findByDiseaseId(Integer id);

}