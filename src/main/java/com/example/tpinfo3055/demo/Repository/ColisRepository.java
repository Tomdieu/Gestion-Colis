package com.example.tpinfo3055.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tpinfo3055.demo.Model.User;

public interface ColisRepository extends JpaRepository<User,Long> {
    
}
