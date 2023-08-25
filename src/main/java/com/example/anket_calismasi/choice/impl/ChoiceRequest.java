package com.example.anket_calismasi.choice.impl;

import com.example.anket_calismasi.choice.api.ChoiceDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChoiceRequest {
    private String value;
    private String title;
    private ChoiceDto choice;
    public ChoiceDto toDto(){
        return ChoiceDto.builder()
                .value(value)
                .title(title)
                .choice(choice)
                .build();
    }
}
