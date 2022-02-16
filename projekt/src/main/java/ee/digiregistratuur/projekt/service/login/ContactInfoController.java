package ee.digiregistratuur.projekt.service.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ContactInfoController {

    @Resource
    private ContactInfoService contactInfoService;

    @GetMapping("/contact/info")
    public ContactInfoResponse getContactInfoByIdCode(@RequestParam String idCode) {
       ContactInfoResponse response = contactInfoService.getContactInfoByIdCode(idCode);
        return response;
    }
}
