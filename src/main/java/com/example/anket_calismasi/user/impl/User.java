package com.example.anket_calismasi.user.impl;

import com.example.anket_calismasi.survey.impl.Survey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String surname;
    private String username;

    private String email;
    private String password;
    private Date signDate;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Survey> surveyList;
}
