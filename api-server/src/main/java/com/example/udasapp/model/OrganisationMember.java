package com.example.udasapp.model;

import com.example.udasapp.model.address.City;
import com.example.udasapp.model.disability.DisabilityCategory;
import com.example.udasapp.model.disability.DisabilityStatus;
import com.example.udasapp.model.disability.Injury;
import com.example.udasapp.model.social.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
@Table(name = "organization_member")
public class OrganisationMember {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /***
     * #####################################
     * General user information
     * #####################################
     */

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    /**
     * Can be empty since organization does not
     * know SSNs of all members, and it is actually a "JMBG",
     * a 13-digit number (as it's validated with regex pattern )
     *  used for personal identification in Bosnia and Herzegovina
     */
    @Pattern(regexp= "\\d{13}")
    @Column(name = "ssn")
    private String ssn;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date deathDate;

    /**
     * #####################################
     * Address information
     * #####################################
     */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    /**
     *  No need for detailed validation for street and home number or creating separate tables
     *  Since the needs of organization are
     *  used only for retaining contact info
     *  and not something like "find all users with specific home number"
     *  and having possibility to find members from same street is not so useful either
     */

    private String street;

    private String homeNumber;

    /**
     * ######################################
     * Contact information
     * #####################################
     */

    @ElementCollection
    List<@NotBlank String> phoneNumbers = new ArrayList<>();

    @ElementCollection
    List<@NotBlank String> emailAddresses = new ArrayList<>();

    /**
     * #####################################
     * Social status information
     * #####################################
     */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "education_level_id")
    private EducationLevel educationLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profession_id")
    private Profession profession;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employment_status_id")
    private EmploymentStatus employmentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marital_status_id")
    private MaritalStatus maritalStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "housing_situation_id")
    private HousingSituation housingSituation;

    /**
     * Actual data that UDAS possesses is not normalized,
     * so it's just a text field, really
     */
    private String householdMemberInfo;

    /**
     * #####################################
     * Disability and injury information
     * #####################################
     */

    @OneToMany
    private List<Injury> injuries = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "disability_category_id")
    private DisabilityCategory disabilityCategory; // I-X

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "disability_status_id")
    private DisabilityStatus disabilityStatus; // RVI, CŽR...

    private double disabilityPercentage; // 0-1

    private boolean hasAmputation;

    /**
     * #####################################
     * User specific notes
     * #####################################
     */
    @Column(name = "note")
    private String note;

}
