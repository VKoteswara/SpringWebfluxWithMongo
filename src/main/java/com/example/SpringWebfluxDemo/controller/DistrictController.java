package com.example.SpringWebfluxDemo.controller;

import com.example.SpringWebfluxDemo.entity.District;
import com.example.SpringWebfluxDemo.service.Impl.DistrictServiceImpl;
import com.example.SpringWebfluxDemo.service.MongoJpaCommonOperations;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class DistrictController {

    @Autowired
    private DistrictServiceImpl districtServiceImpl;

    @PostMapping("/createdistrict")
    public ResponseEntity<Mono<District>>createDistrict(@RequestBody District district){
        Mono<Optional<District>> optionalMono = districtServiceImpl.create(district);
        return new ResponseEntity(optionalMono, HttpStatus.CREATED);
    }
    @GetMapping("/alldistricts")
    public ResponseEntity<Flux<District>> getAllDistrict(){
        Flux<District> all = districtServiceImpl.findAll();
       //Optional<Flux<District>> all1 = Optional.of(all);
        return new ResponseEntity(all, HttpStatus.OK);
    }


}
