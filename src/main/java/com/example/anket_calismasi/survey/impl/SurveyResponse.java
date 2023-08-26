package com.example.anket_calismasi.survey.impl;

import com.example.anket_calismasi.survey.api.SurveyDto;
import com.example.anket_calismasi.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SurveyResponse {
    private int id;
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private UserDto user;

    public static SurveyResponse fromDto(SurveyDto surveyDtoDto) {
        return SurveyResponse.builder()
                .id(surveyDtoDto.getId())
                .question(surveyDtoDto.getQuestion())
                .firstAnswer(surveyDtoDto.getFirstAnswer())
                .secondAnswer(surveyDtoDto.getSecondAnswer())
                .user(UserDto.builder()
                        .id(surveyDtoDto.getUserDto().getId())
                        .name(surveyDtoDto.getUserDto().getName())
                        .surname(surveyDtoDto.getUserDto().getSurname())
                        .username(surveyDtoDto.getUserDto().getUsername())
                        .email(surveyDtoDto.getUserDto().getEmail())
                        .password(surveyDtoDto.getUserDto().getPassword())
                        .build());
    }
}
