package com.example.udasapp.data;

import com.example.udasapp.model.social.Profession;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfessionRepository
        extends CrudRepository<Profession, Long> {
    Optional<Profession> findProfessionByProfessionName(String professionName);
}
