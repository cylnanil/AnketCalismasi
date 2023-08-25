package com.example.anket_calismasi.question.impl;

import com.example.anket_calismasi.question.api.QuestionService;
import com.example.anket_calismasi.user.impl.UserRequest;
import com.example.anket_calismasi.user.impl.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService service;
    @PostMapping
    public QuestionResponse createQuestion(@RequestBody QuestionRequest request) {
        return QuestionResponse.fromDto(service.create(request.toDto()));
    }
    @PutMapping("/{id}")
    public QuestionResponse updateQuestion(@PathVariable(name = "id") String id,
                                           @RequestBody QuestionRequest request){
        return QuestionResponse.fromDto(service.update(id, request.toDto()));
    }
    @GetMapping("/{id}")
    public QuestionResponse getQuestionById(@PathVariable(name = "id") String id) {
        return QuestionResponse.fromDto(service.getById(id));
    }
    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable(name = "id") String id,
                           @RequestBody QuestionRequest request){
        service.delete(id);
    }
}
