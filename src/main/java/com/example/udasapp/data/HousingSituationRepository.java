package com.example.udasapp.data;

import com.example.udasapp.model.social.HousingSituation;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HousingSituationRepository
        extends CrudRepository<HousingSituation, Long> {
    Optional<HousingSituation> findHousingSituationByHousingSituation(String housingSituation);
}
