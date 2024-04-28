package singidunum.ac.rs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singidunum.ac.rs.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
