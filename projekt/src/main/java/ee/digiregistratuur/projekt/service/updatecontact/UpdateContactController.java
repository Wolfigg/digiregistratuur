package ee.digiregistratuur.projekt.service.updatecontact;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UpdateContactController {

    @Resource
    private UpdateContactService updateContactService;

    @PutMapping("/update/contact/info/by/id/code")
    @Operation(summary = "Uuendab kontkatinfo isikukoodi järgi")
    public void updateContactById(@RequestParam String idCode,
                                  @RequestBody UpdateContactRequest updateRequest) {
        updateContactService.updateContactById(idCode, updateRequest);

    }
}
