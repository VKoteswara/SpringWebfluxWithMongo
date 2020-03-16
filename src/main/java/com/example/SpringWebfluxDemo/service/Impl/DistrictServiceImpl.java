package com.example.SpringWebfluxDemo.service.Impl;

import com.example.SpringWebfluxDemo.entity.District;
import com.example.SpringWebfluxDemo.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl extends AbstractMongoJpaCommonOperations<District> {
    @Autowired
    private DistrictRepository districtRepository;
    @Override
    public ReactiveMongoRepository getDao() {
        return districtRepository;
    }
}
