package bloconline.restController;

import bloconline.controller.AptController;
import bloconline.user.Apt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AptRestController {

    @Autowired
    AptController aptController;

    @PostMapping("/insertApt")
    public Apt insertApt(@RequestBody @Valid Apt apt) {
        return aptController.insertApt(apt);
    }
}
