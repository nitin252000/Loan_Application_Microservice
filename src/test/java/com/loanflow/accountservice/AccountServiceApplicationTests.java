package com.loanflow.accountservice;

import com.loanflow.accountservice.entity.Account;
import com.loanflow.accountservice.repository.AccountRepository;
import com.loanflow.accountservice.service.AccountService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountServiceApplicationTests {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    @Test
    void testAccount() {

        Account account = new Account(
                1L,
                "Nitin",
                5000.0
        );

        when(accountRepository.save(any(Account.class)))
                .thenReturn(account);

        Account ac = accountService.create(account);

        assertNotNull(ac);
    }
}