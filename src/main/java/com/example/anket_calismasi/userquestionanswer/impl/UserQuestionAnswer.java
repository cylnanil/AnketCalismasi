package com.example.anket_calismasi.userquestionanswer.impl;

import com.example.anket_calismasi.question.impl.Question;
import com.example.anket_calismasi.userchoice.impl.UserChoice;
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
public class UserQuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "user_choice_id")
    private UserChoice userChoice;
}
