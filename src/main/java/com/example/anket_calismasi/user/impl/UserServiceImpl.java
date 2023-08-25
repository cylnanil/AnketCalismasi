package com.example.anket_calismasi.user.impl;

import com.example.anket_calismasi.survey.api.SurveyService;
import com.example.anket_calismasi.survey.impl.Survey;
import com.example.anket_calismasi.survey.impl.SurveyServiceImpl;
import com.example.anket_calismasi.user.api.UserDto;
import com.example.anket_calismasi.user.api.UserService;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor()
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final SurveyServiceImpl surveyService;

    @Override
    public UserDto create(UserDto dto) {
        if(emailExists(dto.getEmail()))
            throw new EntityExistsException("This email" +dto.getEmail()+"is already exist");
        return toDto(repository.save(toEntity(new User(), dto)));
    }

    @Override
    public UserDto update(String id, UserDto dto) {
        return repository.findById(Integer.parseInt(id))
                .map(user -> toEntity(user, dto))
                .map(repository::save)
                .map(this::toDto)
                .orElseThrow(() -> new EntityNotFoundException("User not found."));
    }
    @Override
    public void delete(String id){
        repository.delete(repository.findById(Integer.parseInt(id)))
                .orElseThrow(() ->(new EntityNotFoundException("User not found"));
    }

    @Override
    public UserDto getById(String id) {
        return null;
    }

    @Override
    public UserDto addSurveyToUser(String id, String surveyId) {
        User user=repository.findById(Integer.parseInt(id)).orElseThrow(EntityNotFoundException::new);
        Survey survey=surveyService.findEntityById(Integer.parseInt(surveyId));

    }


    public boolean emailExists(String email) {
        return repository.existsByEmail(email);
    }

    public User toEntity(User user, UserDto dto) {
        user.setSurname(dto.getSurname());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setSignDate(dto.getSignDate());
        return user;
    }

    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .surname(user.getSurname())
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
                .signDate(user.getSignDate())
                .build();
    }
}
