package com.example.anket_calismasi.question.impl;

import com.example.anket_calismasi.choice.impl.Choice;
import com.example.anket_calismasi.question.api.QuestionDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class QuestionRequest {
    private String title;
    private List<Choice> choices;
    public QuestionDto toDto(){
        return QuestionDto.builder()
                .title(title)
                .choices(choices)
                .build();
    }
}
