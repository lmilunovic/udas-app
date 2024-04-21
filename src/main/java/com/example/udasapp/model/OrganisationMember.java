package com.example.udasapp.model;

import com.example.udasapp.model.address.Address;
import com.example.udasapp.model.disability.Disability;
import com.example.udasapp.model.disability.Injury;
import com.example.udasapp.model.disability.InjuryCause;
import com.example.udasapp.model.social.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class OrganisationMember {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    /**
     * Can be empty since organization does not
     * know SSNs of all members, and it is actually a "JMBG",
     * a 13-digit number (as it's validated with regex pattern )
     *  used for personal identification in Bosnia and Herzegovina
     */

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Pattern(regexp= "\\d{13}")
    private String ssn; // JMBG

    // TODO rethink this relation - member could have more addresses,
    //  or one address could have more members, maybe many to many
    @OneToOne
    private Address address;

    @ElementCollection
    private List<String> phoneNumbers; // TODO make a phone number class and add validation - feature!

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date deathDate;

    // TODO rethink if SocialStatus should be class
    // TODO containing employment, education, profession, housing situation etc...

    // Here current data is not normalised and
    // should be thought/discussed wtih UDAS org
    // about what to do here ! ! !
    private String householdMembers;

    @Enumerated(EnumType.STRING)
    private EmploymentStatus employmentStatus;

    @Enumerated(EnumType.STRING)
    private EducationLevel educationLevel;

    @ManyToOne
    private Profession profession;

    @ManyToOne
    private HousingSituation housingSituation;

    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    // TODO end TODO :)

    @ManyToOne
    private InjuryCause injuryCause; // TODO this should be part of injury

    @ManyToMany
    private List<Injury> injuries;

    @ManyToOne
    private Disability disability;

    private String note;

}
