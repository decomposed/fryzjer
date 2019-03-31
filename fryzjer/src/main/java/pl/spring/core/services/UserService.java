package pl.spring.core.services;

import org.springframework.stereotype.Service;
import pl.spring.data.model.User;
import pl.spring.data.repositories.CustomerRepository;
import pl.spring.dto.LoggedUserDTO;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private CustomerRepository userRepository;

    public boolean checkCredentials(String login, String password) {
        boolean existsUser = userRepository.checkIfUserExists(login, password);
        return existsUser;

        //return true;
    }

    public LoggedUserDTO getUser (String login, String password){
        LoggedUserDTO loggedUserDTO = null;
        User user = userRepository.getUserByLoginAndPassword(login, password);

        if (user != null) {
            loggedUserDTO = new LoggedUserDTO();
            loggedUserDTO.setId(user.getId());
            loggedUserDTO.setLogin(user.getLogin());
            loggedUserDTO.setFirstName(user.getFirstName());
            loggedUserDTO.setLastName(user.getLastName());
        }
        return loggedUserDTO;
    }
}
