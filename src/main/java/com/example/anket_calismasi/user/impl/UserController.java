package com.example.anket_calismasi.user.impl;

import com.example.anket_calismasi.user.api.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest request) {
        return UserResponse.fromDto(service.create(request.toDto()));
    }

    @PutMapping("/{id}")
    public UserResponse updateUser(@PathVariable(name = "id") String id,
                                   @RequestBody UserRequest request) {
        return UserResponse.fromDto(service.update(id, request.toDto()));
    }

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable(name = "id") String id) {
        return UserResponse.fromDto(service.getById(id));
    }

    @PostMapping("/{id}/surveys/{surveyId}")
    public UserResponse addSurveyToUser(@PathVariable(name = "id") String id, @PathVariable(name = "surveyId") String surveyId) {
        return UserResponse.fromDto(service.addSurveyToUser(id, surveyId));
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(name = "id") String id,
                           @RequestBody UserRequest request){
        service.delete(id);
    }
}
