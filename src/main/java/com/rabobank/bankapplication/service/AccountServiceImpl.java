package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.Account;
import com.rabobank.bankapplication.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepo accountRepo;

    @Override
    public List<Account> getAccounts() {

        return accountRepo.findAll();
    }

    @Override
    public Account getAccountById(Long accountId) {

        return accountRepo.findById(accountId).get();
    }

    @Override
    public Account createNewAccount(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public void updateAccount(Long accountId, Account account) {
        Account accountFromDb = accountRepo.findById(accountId).get();
        System.out.println(accountFromDb.toString());
        accountFromDb.setName(account.getName());
        accountFromDb.setEmail(account.getEmail());
        accountFromDb.setIban(account.getIban());
        accountFromDb.setBalance(account.getBalance());
        accountRepo.save(accountFromDb);
    }

    @Override
    public void deleteAccountById(Long accountId) {
        accountRepo.deleteById(accountId);
    }

}
