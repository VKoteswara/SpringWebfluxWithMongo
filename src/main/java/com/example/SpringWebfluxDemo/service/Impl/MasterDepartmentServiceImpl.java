package com.example.SpringWebfluxDemo.service.Impl;

import com.example.SpringWebfluxDemo.entity.MasterDepartment;
import com.example.SpringWebfluxDemo.repository.MasterDepartmentRepository;
import com.example.SpringWebfluxDemo.service.MasterDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MasterDepartmentServiceImpl implements MasterDepartmentService {
    @Autowired
    private MasterDepartmentRepository masterDepartmentRepository;
    @Override
    public Mono<MasterDepartment> createMasterDepartment(MasterDepartment masterDepartment) {
        return masterDepartmentRepository.save(masterDepartment);
    }

    @Override
    public Flux<MasterDepartment> findAll() {
        return masterDepartmentRepository.findAll();
    }

    @Override
    public Mono<MasterDepartment> findOne(String id) {
        return masterDepartmentRepository.findById(id);
    }

    @Override
    public Flux<MasterDepartment> findByDeptCode(String deptCOde) {
        return masterDepartmentRepository.findByDeptCode(deptCOde);
    }
}
