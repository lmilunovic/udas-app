package com.example.udasapp.model.social;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Defines if organization member has its own house or not, if he/she pays rent etc
 * */
@Getter
@Setter
@Entity
public class HousingSituation {
    @Id
    private Long id;

    String housingSituation;

}
