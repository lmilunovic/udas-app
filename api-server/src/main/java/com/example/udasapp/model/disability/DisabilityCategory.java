package com.example.udasapp.model.disability;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents disability category under Bosnia and Herzegovina law I-X
 * This also could be an enum type, although, law could change
 * and I also wanted to make those values "configurable"
 */
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "disability_category")
public class DisabilityCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category")
    private String disabilityCategory;

    public DisabilityCategory(String disabilityCategory) {
        this.disabilityCategory = disabilityCategory;
    }

}