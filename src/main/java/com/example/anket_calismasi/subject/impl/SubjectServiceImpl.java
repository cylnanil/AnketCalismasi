package com.example.anket_calismasi.subject.impl;

import com.example.anket_calismasi.subject.api.SubjectDto;
import com.example.anket_calismasi.subject.api.SubjectService;
import com.example.anket_calismasi.user.api.UserDto;
import com.example.anket_calismasi.user.impl.User;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository repository;
    @Override
    public SubjectDto create(SubjectDto dto){
        if(subjectIdExists(dto.getId()))
            throw new EntityExistsException("This subject id" +dto.getId()+"is already exist");
        return toDto(repository.save(toEntity(new Subject(), dto)));
    }
    @Override
    public SubjectDto update(String id, SubjectDto dto) {
        return repository.findById(Integer.parseInt(id))
                .map(subject -> toEntity(subject, dto))
                .map(repository::save)
                .map(this::toDto)
                .orElseThrow(() -> new EntityNotFoundException("Subject not found."));
    }
    @Override
    public void delete(String id){
        repository.delete(repository.findById(Integer.parseInt(id)))
                .orElseThrow(() ->(new EntityNotFoundException("Subject not found")));
    }
    public boolean subjectIdExists(String id){return repository.existsById(Integer.parseInt(id));}
    public Subject toEntity(Subject subject,SubjectDto dto){
        subject.setId(dto.getId());
        subject.setTitle(dto.getTitle());
        return subject;
    }
    public SubjectDto toDto(Subject subject){
        return SubjectDto.builder()
                .id(subject.getId())
                .title(subject.getTitle())
                .build();
    }
}
