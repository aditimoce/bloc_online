package bloconline.repository;

import bloconline.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepository extends CrudRepository<User, Integer> {

default User updateUser(Integer userID, User user) {
    Optional<User> userToUpdate = findById(userID);

        if (userToUpdate.isPresent()) {
            User userWithIdFound = userToUpdate.get();
            userWithIdFound.setUserName(user.getUserName());
            userWithIdFound.setEmail(user.getEmail());
            return save(userWithIdFound);
        }
        return null;
    }
}
