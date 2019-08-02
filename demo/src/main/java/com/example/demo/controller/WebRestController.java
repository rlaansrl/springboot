package com.example.demo.controller;

import com.example.demo.dto.users.UsersSaveRequestDto;
import com.example.demo.repository.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

    private UserRepository userRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/users")
    public void saveUsers(@RequestBody UsersSaveRequestDto dto){
        userRepository.save(dto.toEntity());
    }
}