package com.example.udasapp.model.disability;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/***
 * Represents cause of an injury i.e. is it a mine, a bullet, a grenade etc...
 */
@Getter
@Setter
@Entity
public class InjuryCause {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String injuryCause; // MINA, NUS, .... (možda enum?)
}
