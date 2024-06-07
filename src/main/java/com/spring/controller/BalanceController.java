package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 유저의 거래내역과 잔고 정보 반환
 */
@RestController
public class BalanceController {
    //
    @GetMapping("/myBalance")
    public String myBalance() {
        return "My Balance";
    }
}
