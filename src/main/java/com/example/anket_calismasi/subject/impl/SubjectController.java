package com.example.anket_calismasi.subject.impl;

import com.example.anket_calismasi.subject.api.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService service;
    @PostMapping
    public SubjectResponse createSubject(@RequestBody SubjectRequest request){
        return SubjectResponse.fromDto(service.create(request.toDto()));
    }
    @PutMapping("/{id}")
    public SubjectResponse updateSubject(@PathVariable(name = "id")String id,
                                         @RequestBody SubjectRequest request){
        return SubjectResponse.fromDto(service.update(id,request.toDto()));
    }
    @GetMapping("/{id}")
    public SubjectResponse getUserById(@PathVariable(name = "id")String id){
        return SubjectResponse.fromDto(service.getById(id));
    }
    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable(name = "id")String id,
                              @RequestBody SubjectRequest request){
        service.delete(id);
    }
}
