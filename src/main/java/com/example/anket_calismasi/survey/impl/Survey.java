package com.example.anket_calismasi.survey.impl;

import com.example.anket_calismasi.question.impl.Question;
import com.example.anket_calismasi.user.impl.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "creatorId")
    private User creator;
    private String subject;
    @ManyToMany(mappedBy = "surveys")
    private Set<User> respondents=new HashSet<>();
    @OneToMany(mappedBy = "survey",cascade = CascadeType.ALL)
    private List<Question>questions;


}
