package com.example.udasapp.model.disability;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * Describes if member was civilian victim, disabled veteran during combat, born with disability etc...
 *
 */
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "disability_status")
public class DisabilityStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "disability_status")
    private String disabilityStatus;

    public DisabilityStatus(String disabilityStatus) {
        this.disabilityStatus = disabilityStatus;
    }
}
