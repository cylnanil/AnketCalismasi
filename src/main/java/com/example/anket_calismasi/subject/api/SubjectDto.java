package com.example.anket_calismasi.subject.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubjectDto {
    private int id;
    private String title;
}
