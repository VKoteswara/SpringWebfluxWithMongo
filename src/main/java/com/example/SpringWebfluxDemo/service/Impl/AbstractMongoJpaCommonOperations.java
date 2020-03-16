package com.example.SpringWebfluxDemo.service.Impl;

import com.example.SpringWebfluxDemo.service.MongoJpaCommonOperations;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Transactional
public abstract class AbstractMongoJpaCommonOperations<T> implements MongoJpaCommonOperations<T> {
    @Override
    public Mono<Optional<T>> create(T t/*,ReactiveMongoRepository reactiveMongoRepository*/) {
        Optional.ofNullable(t);
         Mono save = getDao().save(t);
        return save;
    }

    @Override
    public Mono<T> update(T t,Long id) {
        Mono<T> one = findOne(id);
        BeanUtils.copyProperties(t,one);
        Mono save = getDao().save(one);
        return save;
    }

    @Override
    public Flux<List<T>> findAll(Long id) {
        Example<Long> of = Example.of(id);
        return getDao().findAll(of);
    }

    @Override
    public Flux findAll() {
        return getDao().findAll();
    }

    @Override
    public Mono<T> findOne(Long id) {
        Example<Long> of = Example.of(id);
        Mono one = getDao().findOne(of);
        return one;
    }


    protected abstract ReactiveMongoRepository getDao();
}
