package com.example.SpringWebfluxDemo.repository;

import com.example.SpringWebfluxDemo.entity.MasterDepartment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MasterDepartmentRepository extends ReactiveMongoRepository<MasterDepartment,String> {
    Flux<MasterDepartment> findByDeptCode(String deptCode);
}
