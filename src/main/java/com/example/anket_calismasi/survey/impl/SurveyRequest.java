package com.example.anket_calismasi.survey.impl;

import com.example.anket_calismasi.survey.api.SurveyDto;
import com.example.anket_calismasi.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SurveyRequest {
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private int userId;

    public SurveyDto toDto() {
        return SurveyDto.builder()
                .question(question)
                .firstAnswer(firstAnswer)
                .secondAnswer(secondAnswer)
                .userDto(UserDto.builder()
                        .id(userId)
                        .build())
                .build();
    }
}
