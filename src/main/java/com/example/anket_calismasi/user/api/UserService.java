package com.example.anket_calismasi.user.api;

import com.example.anket_calismasi.user.impl.User;

public interface UserService {
    UserDto create(UserDto dto);

    UserDto update(String id, UserDto dto);

    UserDto getById(String id);

    UserDto addSurveyToUser(String id, String surveyId);

    void delete(String id);
}
