package com.communityproject.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class LoginController {
    @GetMapping("/login")
    public Mono<String> login(){
        return Mono.just("login");
    }
}
