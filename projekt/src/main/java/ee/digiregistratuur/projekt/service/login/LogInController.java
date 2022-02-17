package ee.digiregistratuur.projekt.service.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LogInController {

    @Resource
    private LogInService logInService;

    @GetMapping("/log/in")
    public LogInResponse logInByIdCode(@RequestParam String idCode) {
        LogInResponse response = logInService.logInByIdCode(idCode);
        return response;
    }


}
