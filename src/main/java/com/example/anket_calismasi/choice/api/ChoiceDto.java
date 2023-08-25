package com.example.anket_calismasi.choice.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChoiceDto {
    private int id;
    private String value;
    private String title;
    private ChoiceDto choice;
}
