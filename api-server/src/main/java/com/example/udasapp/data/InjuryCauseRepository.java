package com.example.udasapp.data;

import com.example.udasapp.model.disability.InjuryCause;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InjuryCauseRepository
        extends CrudRepository<InjuryCause, Long> {
    Optional<InjuryCause> findInjuryCauseByInjuryCauseName(String injuryCauseName);
}
