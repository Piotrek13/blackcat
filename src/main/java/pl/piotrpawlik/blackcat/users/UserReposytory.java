package pl.piotrpawlik.blackcat.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserReposytory extends JpaRepository<User, Long> {

    Optional<User> findByLoginAndPassword(String login, String password);


}
