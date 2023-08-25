package com.example.anket_calismasi.survey.impl;

import com.example.anket_calismasi.survey.api.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/surveys")
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyService service;
    @PostMapping
    public SurveyResponse createSurvey(@RequestBody SurveyRequest request) {
        return SurveyResponse.fromDto(service.create(request.toDto()));
    }
}
