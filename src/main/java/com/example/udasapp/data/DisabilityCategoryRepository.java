package com.example.udasapp.data;

import com.example.udasapp.model.disability.DisabilityCategory;
import org.springframework.data.repository.CrudRepository;

public interface DisabilityCategoryRepository
        extends CrudRepository<DisabilityCategory, Long> {
}
