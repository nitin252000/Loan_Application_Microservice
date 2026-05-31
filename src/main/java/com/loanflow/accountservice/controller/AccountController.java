package com.loanflow.accountservice.controller;

import com.loanflow.accountservice.entity.Account;
import com.loanflow.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

  @PostMapping("/accounts")
    public Account getAccount(@RequestBody Account account){
      return accountService.create(account);
  }
  @GetMapping
    public List<Account> getAcc(){
      return accountService.getAllAccount();
  }

}
