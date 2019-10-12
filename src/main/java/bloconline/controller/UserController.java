package bloconline.controller;

import bloconline.service.UserService;
import bloconline.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User insertUser(User user) {
        return userService.insertUser(user);
    }

    public void deleteUserById(int ID) {
        userService.deleteUserById(ID);
    }

    public User updateUser(int ID, User user) {
        return userService.updateUser(ID, user);
    }
}
