package ee.digiregistratuur.projekt.domain.disease;

import lombok.Data;

import java.io.Serializable;

@Data
public class DiseaseResponse implements Serializable {
    private final String name;
    private final String description;
}
