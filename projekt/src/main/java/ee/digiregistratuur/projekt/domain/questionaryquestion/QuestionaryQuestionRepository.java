package ee.digiregistratuur.projekt.domain.questionaryquestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuestionaryQuestionRepository extends JpaRepository<QuestionaryQuestion, Integer> {
    @Query("select q from QuestionaryQuestion q where q.disease.id = ?1")
    List<QuestionaryQuestion> findByDiseaseId(Integer id);

    @Override
    Optional<QuestionaryQuestion> findById(Integer integer);

    @Override
    void deleteById(Integer integer);

    @Query("select q from QuestionaryQuestion q where q.disease.id = ?1")
    List<QuestionaryQuestion> findQuestionsByDiseaseId(Integer id);






}