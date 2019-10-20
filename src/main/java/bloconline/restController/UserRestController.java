package bloconline.restController;

import bloconline.controller.UserController;
import bloconline.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {

    @Autowired
    UserController userController;

    @PostMapping("/insertUser")
    public User insertUser(@RequestBody User user) {
        return userController.insertUser(user);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestParam Integer userID, @RequestBody User user) {
        return userController.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{userID}")
    public void deleteUser(@PathVariable Integer userID) {
        userController.deleteUserById(userID);
    }
}
