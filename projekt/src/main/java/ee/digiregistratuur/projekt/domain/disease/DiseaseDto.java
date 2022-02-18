package ee.digiregistratuur.projekt.domain.disease;

import lombok.Data;

import java.io.Serializable;

@Data
public class DiseaseDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String description;
}
