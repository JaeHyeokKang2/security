package com.example.springsecsections3.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    //
    @GetMapping("/myLoans")
    public String myLoans() {
        return "my loans";
    }
}
