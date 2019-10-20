package bloconline.controller;

import bloconline.service.AptService;
import bloconline.user.Apt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AptController {

    private final AptService aptService;

    @Autowired
    public AptController(AptService aptService) {
        this.aptService = aptService;
    }

    public Apt insertApt(Apt apt) {
        return aptService.insertApt(apt);
    }
}
