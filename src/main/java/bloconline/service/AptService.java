package bloconline.service;

import bloconline.repository.AptRepository;
import bloconline.user.Apt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AptService {

    private final AptRepository aptRepository;

    @Autowired
    public AptService(AptRepository aptRepository) {
        this.aptRepository = aptRepository;
    }

    public Apt insertApt(Apt apt) {
        return aptRepository.save(apt);
    }

}
