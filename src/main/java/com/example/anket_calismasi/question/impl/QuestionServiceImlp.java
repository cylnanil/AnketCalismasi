package com.example.anket_calismasi.question.impl;

import com.example.anket_calismasi.question.api.QuestionService;
import com.example.anket_calismasi.user.api.UserDto;
import com.example.anket_calismasi.user.impl.User;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionServiceImlp implements QuestionService {
    private final QuestionRepository repository;


}
