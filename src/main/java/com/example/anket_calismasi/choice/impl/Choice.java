package com.example.anket_calismasi.choice.impl;

import com.example.anket_calismasi.question.impl.Question;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String value;
    private String title;
    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;
}
