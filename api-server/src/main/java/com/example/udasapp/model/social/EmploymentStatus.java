package com.example.udasapp.model.social;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "employment_status")
public class EmploymentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employment_status")
    private String employmentStatus;

    public EmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}
