package com.example.anket_calismasi.choice.impl;

import com.example.anket_calismasi.choice.api.ChoiceService;
import com.example.anket_calismasi.user.impl.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/choices")
@RequiredArgsConstructor
public class ChoiceController {
    private final ChoiceService service;

    @PostMapping
    public ChoiceResponse createChoice(@RequestBody ChoiceRequest request) {
        return ChoiceResponse.fromDto(service.create(request.toDto()));
    }

    @PutMapping("/{id}")
    public ChoiceResponse updateChoice(@PathVariable(name = "id") String id,
                                       @RequestBody ChoiceRequest request) {
        return ChoiceResponse.fromDto(service.update(id, request.toDto()));
    }

    @GetMapping("/{id}")
    public ChoiceResponse getChoiceById(@PathVariable(name = "id") String id) {
        return ChoiceResponse.fromDto(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteChoice(@PathVariable(name = "id") String id,
                             @RequestBody ChoiceRequest request) {
        service.delete(id);
    }

    @PostMapping("/{id}/choices/{choiceId}")
    public ChoiceResponse addChoiceToSurvey(@PathVariable(name = "id") String id, @PathVariable(name = "choiceId") String choiceId) {
        return ChoiceResponse.fromDto(service.addChoiceToSurvey(id, choiceId));
    }
}
