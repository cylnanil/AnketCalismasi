package com.example.anket_calismasi.user.api;

import com.example.anket_calismasi.survey.api.SurveyDto;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class UserDto {
    private int id;
    private String surname;
    private String username;

    private String email;
    private String password;
    private Date signDate;

}
