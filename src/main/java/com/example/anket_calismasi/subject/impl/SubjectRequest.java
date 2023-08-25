package com.example.anket_calismasi.subject.impl;

import com.example.anket_calismasi.subject.api.SubjectDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubjectRequest {
    private String title;
    public SubjectDto toDto(){
        return SubjectDto.builder()
                .title(title)
                .build();
    }
}
