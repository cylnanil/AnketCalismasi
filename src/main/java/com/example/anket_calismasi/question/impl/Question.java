package com.example.anket_calismasi.question.impl;

import com.example.anket_calismasi.choice.impl.Choice;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Choice>choices;
}
