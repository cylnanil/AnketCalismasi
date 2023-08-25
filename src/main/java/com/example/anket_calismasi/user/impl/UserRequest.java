package com.example.anket_calismasi.user.impl;

import com.example.anket_calismasi.survey.api.SurveyDto;
import com.example.anket_calismasi.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class UserRequest {
    private String surname;
    private String username;

    private String email;
    private String password;
    private Date signDate;

    public UserDto toDto() {
        return UserDto.builder()
                .surname(surname)
                .username(username)
                .email(email)
                .password(password)
                .signDate(signDate)
                .build();
    }
}
