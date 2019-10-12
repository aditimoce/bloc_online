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
        return userRepository.insertUser(user);
    }

    public void deleteUserById(int ID) {
        userRepository.deleteById(ID);
    }

    public User updateUser(int ID, User user) {
        return userRepository.updateUser(ID, user);
    }
}
