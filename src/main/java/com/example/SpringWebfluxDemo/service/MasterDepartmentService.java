package com.example.SpringWebfluxDemo.service;

import com.example.SpringWebfluxDemo.entity.MasterDepartment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MasterDepartmentService {
    Mono<MasterDepartment> createMasterDepartment(MasterDepartment masterDepartment);

   // Mono<MasterDepartment> updateBlog(MasterDepartment masterDepartment, String id);

    Flux<MasterDepartment> findAll();

    Mono<MasterDepartment> findOne(String id);

    Flux<MasterDepartment> findByDeptCode(String deptCOde);

    //Mono<Boolean> delete(String id);
}
