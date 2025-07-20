package henrique.igor.library_system.repositories;

import henrique.igor.library_system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<User, UUID> {
    User findByEmail(String email);
}
