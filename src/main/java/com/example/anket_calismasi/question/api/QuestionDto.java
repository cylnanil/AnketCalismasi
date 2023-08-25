package com.example.anket_calismasi.question.api;

import com.example.anket_calismasi.choice.impl.Choice;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class QuestionDto {
    private int id;
    private String title;
    private List<Choice> choices;
}
