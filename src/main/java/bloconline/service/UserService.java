package bloconline.service;

import bloconline.repository.UserRepository;
import bloconline.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User insertUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Integer userID) {
        userRepository.deleteById(userID);
    }

    public User updateUser(Integer userID, User user) {
        return userRepository.updateUser(userID, user);
    }
}
