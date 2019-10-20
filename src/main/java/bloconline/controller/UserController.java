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

    public void deleteUserById(Integer userID) {
        userService.deleteUserById(userID);
    }

    public User updateUser(Integer userID, User user) {
        return userService.updateUser(userID, user);
    }
}
