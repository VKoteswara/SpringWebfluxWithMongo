package com.example.SpringWebfluxDemo.service;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface MongoJpaCommonOperations<T> {
    Mono<Optional<T>> create(T t/*, ReactiveMongoRepository reactiveMongoRepository*/);
    Mono<T> update(T t,Long id);
    Flux<List<T>> findAll(Long id);
    Flux<T> findAll();
    Mono<T> findOne(Long id);
}
