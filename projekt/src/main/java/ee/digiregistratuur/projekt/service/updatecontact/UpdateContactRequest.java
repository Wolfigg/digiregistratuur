package ee.digiregistratuur.projekt.service.updatecontact;


import lombok.Data;

@Data
public class UpdateContactRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String mobile;
    private final String address;
}
