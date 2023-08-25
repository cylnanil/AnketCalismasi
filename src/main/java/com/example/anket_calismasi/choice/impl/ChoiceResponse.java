package com.example.anket_calismasi.choice.impl;

import com.example.anket_calismasi.choice.api.ChoiceDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChoiceResponse {
    private int id;
    private String value;
    private String title;
    private ChoiceDto choice;
    public static ChoiceResponse fromDto(ChoiceDto choiceDto){
        return ChoiceResponse.builder()
                .id(choiceDto.getId())
                .value(choiceDto.getValue())
                .title(choiceDto.getTitle())
                .choice(choiceDto.getChoice())
                .build();
    }
}
