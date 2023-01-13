package com.example.tpinfo3055.demo.Repository;

import java.util.Optional;

import com.example.tpinfo3055.demo.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    // @Query("SELECT u FROM users u WHERE u.username = ?1")
    Optional<User> findUserByUsername(String username);

    // User findByUserName(String username);
}
