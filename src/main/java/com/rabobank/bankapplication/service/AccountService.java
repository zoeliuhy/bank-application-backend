package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    List<Account> getAccounts();

    Account getAccountById(Long accountId);

    Account createNewAccount(Account account);

    void updateAccount(Long accountId, Account account);

    void deleteAccountById(Long accountId);


}
