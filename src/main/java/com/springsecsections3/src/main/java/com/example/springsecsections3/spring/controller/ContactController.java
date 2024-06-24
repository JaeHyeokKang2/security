package com.example.springsecsections3.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    //
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
