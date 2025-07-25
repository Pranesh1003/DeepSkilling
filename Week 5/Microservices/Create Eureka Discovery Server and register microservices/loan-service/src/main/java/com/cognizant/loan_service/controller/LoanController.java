package com.cognizant.loan_service.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoanController {
	
	@GetMapping("loan")
    public String getLoan() {
        return "Loan Info";
    }
}