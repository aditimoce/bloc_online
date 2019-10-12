package bloconline.userRestController;

import bloconline.controller.UserController;
import bloconline.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    UserController userController;

    @PostMapping("/insertUser")
    public User insertUser(@RequestBody User user) {
        return userController.insertUser(user);
    }
}
