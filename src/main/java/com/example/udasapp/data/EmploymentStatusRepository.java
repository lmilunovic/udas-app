package com.example.udasapp.data;

import com.example.udasapp.model.social.EmploymentStatus;
import org.springframework.data.repository.CrudRepository;

public interface EmploymentStatusRepository
        extends CrudRepository<EmploymentStatus, Long> {
}
