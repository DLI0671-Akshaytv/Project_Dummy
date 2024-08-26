package com.example.dummy_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloContorller {

    public String hello() {
        return "Hello World";
    }
}
