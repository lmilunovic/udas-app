package com.example.udasapp.model.disability;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/***
 * Describes if member was civilian victim, disabled veteran during combat, born with disability etc...
 *
 */
@Setter
@Getter
@Entity
public class DisabilityStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

}
