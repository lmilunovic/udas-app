package com.example.udasapp.model.disability;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "injury")
public class Injury {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String injuryDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "injury_cause_id")
    private InjuryCause injuryCause;

    @OneToMany
    List<InjuredBodyPart> injuredBodyParts;

    public Injury( String injuryDescription, InjuryCause injuryCause, List<InjuredBodyPart> injuredBodyParts ) {
        this.injuryDescription = injuryDescription;
        this.injuryCause = injuryCause;
        this.injuredBodyParts = injuredBodyParts;
    }

}
