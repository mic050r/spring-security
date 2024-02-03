package me.mic050r.springsecurity.user.repository;

import me.mic050r.springsecurity.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}