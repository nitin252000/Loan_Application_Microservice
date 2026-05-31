package com.loanflow.loanservice.service;

import com.loanflow.loanservice.entity.Loan;
import com.loanflow.loanservice.repository.LoanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LoanService {
    private final LoanRepository repository;
    public Loan CreateLoan(Loan loan){
       return  repository.save(loan);
    }
    public List<Loan> getAllLoans(){
        return repository.findAll();
    }
}
