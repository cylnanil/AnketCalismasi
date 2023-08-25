package com.example.anket_calismasi.question.impl;

import com.example.anket_calismasi.choice.impl.Choice;
import com.example.anket_calismasi.question.api.QuestionDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class QuestionResponse {
    private int id;
    private String title;
    private List<Choice>choices;

    public static QuestionResponse fromDto(QuestionDto questionDto){
        return QuestionResponse.builder()
                .id(questionDto.getId())
                .title(questionDto.getTitle())
                .choices(questionDto.getChoices())
                .build();
    }
}
