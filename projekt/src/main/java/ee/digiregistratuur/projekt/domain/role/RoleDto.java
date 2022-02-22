package ee.digiregistratuur.projekt.domain.role;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleDto implements Serializable {
    private final Integer id;
    private final String name;
}
