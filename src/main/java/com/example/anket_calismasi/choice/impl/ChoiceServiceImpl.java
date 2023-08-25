package com.example.anket_calismasi.choice.impl;

import com.example.anket_calismasi.choice.api.ChoiceDto;
import com.example.anket_calismasi.choice.api.ChoiceService;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChoiceServiceImpl implements ChoiceService {
    private final ChoiceRepository repository;

    @Override
    public ChoiceDto create(ChoiceDto dto){
        if (choiceExists(dto.getId()))
            throw new EntityExistsException("This choice id" +dto.getId()+"is already exist");
        return toDto(repository.save(toEntity(new Choice(),dto)));
    }
    @Override
    public ChoiceDto update(String id, ChoiceDto dto){
        return repository.findById(Integer.parseInt(id))
                .map(choice->toEntity(choice,dto))
                .map(repository::save)
                .map(this.toDto)
                .orElseThrow(() -> new EntityNotFoundException("Choice not found."));
    }
    @Override
    public void delete(String id){
        repository.delete(repository.findyById(Integer.parseInt(id)))
                .orElseThrow(() ->(new EntityNotFoundException("Choice not found")));
    }

    public boolean choiceExists(String id){ return repository.existsById(id);}

    public Choice toEntity(Choice choice, ChoiceDto dto){
        choice.setId(dto.getId());
        choice.setValue(dto.getValue());
        choice.setTitle(dto.getTitle());
        choice.setQuestion(dto.getQuestionDto());//BURAYA QUESTION İSTİYO AMA QUESTION VEREMEM DTO VERMEM LAZIM NASIL OLCAK//
        return choice;
    }
    public ChoiceDto toDto(Choice choice){
        return ChoiceDto.builder()
                .id(choice.getId())
                .value(choice.getValue())
                .title(choice.getTitle())
                .build();
    }
}
