package com.example.udasapp.model.address;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    // TODO consider if separate table is needed here based on what UDAS needs
    private String municipality;

    public City(String cityName) {
        this.cityName = cityName;
        this.municipality = cityName;
    }

    public City(String cityName, String municipality) {
        this.cityName = cityName;
        this.municipality = municipality;
    }

}
