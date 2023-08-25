package com.example.anket_calismasi.survey.api;

import com.example.anket_calismasi.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SurveyDto {
    private int id;
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private UserDto userDto;
}
