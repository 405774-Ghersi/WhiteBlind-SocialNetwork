package WhiteBlind.project.WhiteBlind.domain.services;

import WhiteBlind.project.WhiteBlind.domain.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAllUsers();

}
