package net.proselyte.jwtppdem.repository;

import net.proselyte.jwtppdem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}