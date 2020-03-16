package com.example.SpringWebfluxDemo.controller;

import com.example.SpringWebfluxDemo.entity.MasterDepartment;
import com.example.SpringWebfluxDemo.service.MasterDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class MasterDepartmentController {

    @Autowired
    private MasterDepartmentService masterDepartmentService;

    @PostMapping(value="/createmasterdepartment")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<MasterDepartment> create(@RequestBody MasterDepartment masterDepartment) {
        return masterDepartmentService.createMasterDepartment(masterDepartment);
    }

    @GetMapping(value="/findall")
    public Flux<MasterDepartment> findAll() {
        return masterDepartmentService.findAll();
    }

    @GetMapping("findbydeptcode/{deptCode}")
    public Flux<MasterDepartment> findOne(@PathVariable String deptCode) {
        return masterDepartmentService.findByDeptCode(deptCode);
    }
}
