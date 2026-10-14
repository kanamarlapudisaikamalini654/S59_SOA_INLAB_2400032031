package com.klu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    User findByUsername(String username);
}