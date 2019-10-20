package bloconline.repository;

import bloconline.user.Apt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AptRepository extends CrudRepository<Apt, Integer> {
}
