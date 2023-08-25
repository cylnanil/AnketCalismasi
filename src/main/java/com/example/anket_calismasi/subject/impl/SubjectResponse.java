package com.example.anket_calismasi.subject.impl;

import com.example.anket_calismasi.subject.api.SubjectDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubjectResponse {
    private int id;
    private String title;
    public static SubjectResponse fromDto(SubjectDto subjectDto){
        return SubjectResponse.builder()
                .id(subjectDto.getId())
                .title(subjectDto.getTitle())
                .build();
    }
}
