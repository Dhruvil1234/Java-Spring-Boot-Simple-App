package com.example.simpleapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping("/person")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    
}