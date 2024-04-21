package com.example.udasapp.model.disability;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Injury {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private String injury;
    private boolean amputation;

}
