package com.loanflow.loanservice.controller;

import com.loanflow.loanservice.entity.Loan;
import com.loanflow.loanservice.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/loans")
public class LoanController {
    private final LoanService service;
    @PostMapping("apply")
    public Loan apply(@RequestBody Loan loan){
        return service.CreateLoan(loan);
    }
    @GetMapping
    public List<Loan> getloans(){
        return service.getAllLoans();
    }
}
