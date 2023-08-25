package com.example.anket_calismasi.user.impl;

import com.example.anket_calismasi.survey.api.SurveyDto;
import com.example.anket_calismasi.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class UserResponse {
    private int id;
    private String surname;
    private String username;
    private String email;
    private String password;
    private Date signDate;

    public static UserResponse fromDto(UserDto userDto){
        return UserResponse.builder()
                .id(userDto.getId())
                .surname(userDto.getSurname())
                .password(userDto.getPassword())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .signDate(userDto.getSignDate())
                .build();

    }
}
