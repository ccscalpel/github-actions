package com.example.githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    @GetMapping()
    public String helloWorld(){
        return "Hello world!!!";
    }
}
