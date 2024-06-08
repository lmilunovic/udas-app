package com.example.udasapp.model.disability;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * Represents cause of an injury i.e. is it a mine, a bullet, a grenade etc...
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "injury_cause")
public class InjuryCause {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "injury_cause_name")
    private String injuryCauseName;

    public InjuryCause(String injuryCauseName) {
        this.injuryCauseName = injuryCauseName;
    }
}
