package ee.digiregistratuur.projekt.domain.disease;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiseaseRepository extends JpaRepository<Disease, Integer> {

    @Override
    Optional<Disease> findById(Integer id);



}