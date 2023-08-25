package com.example.anket_calismasi.choice.api;

import com.example.anket_calismasi.question.api.QuestionDto;
import com.example.anket_calismasi.question.impl.Question;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChoiceDto {
    private int id;
    private String value;
    private String title;
    private QuestionDto questionDto;
}
