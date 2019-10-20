package bloconline.service;

import bloconline.user.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

