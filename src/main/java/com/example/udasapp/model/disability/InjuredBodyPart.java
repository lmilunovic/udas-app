package com.example.udasapp.model.disability;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * Represents body part that is injured/disabled i.e. arm, leg, ear, eye, head
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "injured_body_part")
public class InjuredBodyPart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "body_part_name")
    private String bodyPartName;

    public InjuredBodyPart(String bodyPartName) {
        this.bodyPartName = bodyPartName;
    }
}
