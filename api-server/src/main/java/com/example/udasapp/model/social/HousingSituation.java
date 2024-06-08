package com.example.udasapp.model.social;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Defines if organization member has its own house or not, if he/she pays rent etc
 * */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "housing_situation")
public class HousingSituation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "housing_situation")
    String housingSituation;

    public HousingSituation(String housingSituation) {
        this.housingSituation = housingSituation;
    }

}
