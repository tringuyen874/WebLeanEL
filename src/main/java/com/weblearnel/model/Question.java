package com.weblearnel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private long id;

    @Column(name = "content")
    private String content;

    @Column(name = "answer")
    private String answer;

    @Column(name = "option1")
    private String option1;

    @Column(name = "option2")
    private String option2;

    @Column(name = "option3")
    private String option3;

    @Column(name = "option4")
    private String option4;

    @Column(name = "explaination")
    private String explaination;

    @Column(name = "type")
    private String type;

    // @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_lv_id", referencedColumnName = "lv_id")
    // private Level level;

    // @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_tp_id", referencedColumnName = "tp_id")
    // private Topic topic;
}
