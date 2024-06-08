package com.example.udasapp.model.social;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * List of possible professions that apply to Organization members
 * */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "profession")
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "profession_name")
    private String professionName;

    public Profession(String professionName) {
        this.professionName = professionName;
    }
}
