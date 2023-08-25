package com.example.anket_calismasi.survey.impl;

import com.example.anket_calismasi.survey.api.SurveyDto;
import com.example.anket_calismasi.survey.api.SurveyService;
import com.example.anket_calismasi.user.api.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyServiceImpl implements SurveyService {
    private final SurveyRepository repository;
    private final UserService userService;

    @Override
    public SurveyDto create(SurveyDto dto) {
        return toDto(repository.save(toEntity(new Survey(), dto)));
    }

    public Survey toEntity(Survey survey, SurveyDto dto) {
        return null;
    }

    public Survey findEntityById(int id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
