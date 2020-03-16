package com.example.SpringWebfluxDemo.repository;

import com.example.SpringWebfluxDemo.entity.State;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StateRepository extends ReactiveMongoRepository<State,Long> {
}
