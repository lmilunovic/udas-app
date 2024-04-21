package com.example.udasapp.model.address;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Municipality {
    @Id
    private Long id;

    // TODO re-think how to handle this "cross reference" with city,
    //  feels hacky now :)
    @ManyToOne
    private City city;

    private String name;
}
