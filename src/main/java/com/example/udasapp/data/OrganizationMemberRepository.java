package com.example.udasapp.data;

import com.example.udasapp.model.OrganisationMember;
import org.springframework.data.repository.CrudRepository;


public interface OrganizationMemberRepository
        extends CrudRepository<OrganisationMember, Long> {
}
