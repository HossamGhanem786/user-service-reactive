package com.ghanem.user.controller;

import com.ghanem.user.model.UserRequest;
import com.ghanem.user.model.UserResponse;
import com.ghanem.user.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.BufferOverflowStrategy;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Mono<UserResponse> saveUser(@RequestBody UserRequest request)
    {
        return userService.saveUser(request);
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<UserResponse> retrieveUsers() {
        return userService.retrieveUsers();
    }

//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<UserResponse> retrieveUsers() {
//        return userService.retrieveUsers()
//                .onBackpressureBuffer(10, BufferOverflowStrategy.DROP_OLDEST)
//                .delayElements(Duration.ofMillis(100))
//                .log();
//    }
//
}