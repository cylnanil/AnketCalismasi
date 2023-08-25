package com.example.anket_calismasi.choice.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChoiceRepository extends JpaRepository<Choice,Integer> {
    boolean existsById(String id);
    Optional<Object> delete(Optional<Choice> byId);

}
