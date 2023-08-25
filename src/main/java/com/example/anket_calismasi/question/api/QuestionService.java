package com.example.anket_calismasi.question.api;

import com.example.anket_calismasi.user.api.UserDto;

public interface QuestionService {

    QuestionDto create(QuestionDto dto);
    QuestionDto update(String id, QuestionDto dto);

    QuestionDto getById(String id);

    void delete(String id);
}
