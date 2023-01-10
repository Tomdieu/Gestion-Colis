package com.example.tpinfo3055.demo.Users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    // @Query("SELECT u FROM users u WHERE u.username = ?1")
    Optional<User> findUserByUsername(String username);
}
