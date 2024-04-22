package com.example.udasapp.data;

import com.example.udasapp.model.disability.Injury;
import org.springframework.data.repository.CrudRepository;

public interface InjuryRepository
        extends CrudRepository<Injury, Long> {
}
