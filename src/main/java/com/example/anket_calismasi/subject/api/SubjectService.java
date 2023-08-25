package com.example.anket_calismasi.subject.api;

public interface SubjectService {
    SubjectDto create(SubjectDto dto);
    SubjectDto update(String id, SubjectDto dto);
    SubjectDto getById(String id);
    void delete(String id);
}
