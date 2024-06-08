package com.example.udasapp.data;

import com.example.udasapp.model.disability.DisabilityStatus;
import org.springframework.data.repository.CrudRepository;

public interface DisabilityStatusRepository
    extends CrudRepository<DisabilityStatus, Long> {
}
