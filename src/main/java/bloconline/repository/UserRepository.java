package bloconline.repository;

import bloconline.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public User insertUser(User u) {
        boolean insertionResult = userList.add(u);

        if (insertionResult) {
            return u;
        } else {
            return null;
        }
    }

    public User updateUser(int id, User user) {
        return null;
    }

    public void deleteById(int id) {
    }
}
