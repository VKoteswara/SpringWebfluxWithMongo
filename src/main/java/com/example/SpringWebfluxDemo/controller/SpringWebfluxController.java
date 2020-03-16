package com.example.SpringWebfluxDemo.controller;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.Future;

@RestController
public class SpringWebfluxController {

    @GetMapping(value = "/getstringviamono")
    public Mono<String> getStringWithMono(){
        Mono<String> str= Mono.just("Hello world").log();
        return str;
    }
    @GetMapping(value = "/getstringviaflux")
    public Flux<String> getString(){
        Flux<String> str= Flux.just("Hello","Nisum");
        str.subscribe(System.out::println);
        return str;
    }
    @GetMapping(value = "/getmessages")
    public Future<String> getMesssges(){
        Mono<String> str= Mono.just("Hello world").log();
        return str.toFuture();
    }
}
