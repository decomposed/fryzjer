package pl.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.spring.data.model.User;

public interface CustomerRepository extends JpaRepository<User, Long> {

    @Query(nativeQuery = true,
            value = "SELECT CASE WHEN count(*) >= 1 THEN 'true' ELSE 'false' END " +
                    "FROM users WHERE login = ?1 AND password = ?2")
    Boolean checkIfUserExists(String login, String password);

    User getUserByLoginAndPassword(String login, String password);

}
