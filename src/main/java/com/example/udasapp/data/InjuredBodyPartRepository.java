package com.example.udasapp.data;

import com.example.udasapp.model.disability.InjuredBodyPart;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InjuredBodyPartRepository
        extends CrudRepository<InjuredBodyPart, Long> {
    Optional<InjuredBodyPart> findInjuredBodyPartByBodyPartName(String bodyPartName);
}
