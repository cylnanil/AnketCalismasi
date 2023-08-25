package com.example.anket_calismasi.user.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByEmail(String email);

    Optional<Object> delete(Optional<User> byId);
}
