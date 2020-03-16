package com.example.SpringWebfluxDemo.repository;

import com.example.SpringWebfluxDemo.entity.District;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends ReactiveMongoRepository<District,Long> {
}
