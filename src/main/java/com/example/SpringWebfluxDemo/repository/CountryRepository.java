package com.example.SpringWebfluxDemo.repository;

import com.example.SpringWebfluxDemo.entity.Country;
import com.example.SpringWebfluxDemo.service.MongoJpaCommonOperations;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends ReactiveMongoRepository<Country,Long> {
}
