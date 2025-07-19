package com.cognizant.account_service.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @GetMapping("/account")
    public String getAccount() {
        return "Account Info";
    }
}
