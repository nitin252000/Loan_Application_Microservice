package com.loanflow.accountservice.service;

import com.loanflow.accountservice.entity.Account;
import com.loanflow.accountservice.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;


    public Account create(Account account){
        return accountRepository.save(account);
    }
    public List<Account> getAllAccount(){
      return  accountRepository.findAll();
    }
}
