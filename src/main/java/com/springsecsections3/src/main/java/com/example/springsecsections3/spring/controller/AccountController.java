package com.example.springsecsections3.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class AccountController {
    //
    @GetMapping("/myAccount")
    public String myAccount() {
        return "Here is your account";
    }
}
