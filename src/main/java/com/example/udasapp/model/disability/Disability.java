package com.example.udasapp.model.disability;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Disability {

    @Id
    private Long id;

    @ManyToOne
    DisabilityStatus status;

    @Enumerated(EnumType.STRING)
    DisabilityCategory category;

    double percentage;

}
