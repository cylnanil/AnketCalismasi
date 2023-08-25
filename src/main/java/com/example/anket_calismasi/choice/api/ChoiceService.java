package com.example.anket_calismasi.choice.api;

public interface ChoiceService {
    ChoiceDto create(ChoiceDto dto);
    ChoiceDto update(String id, ChoiceDto dto);
    ChoiceDto getById(String id);
    ChoiceDto addChoiceToSurvey(String id,String choiceId);
    void delete(String id);

}
