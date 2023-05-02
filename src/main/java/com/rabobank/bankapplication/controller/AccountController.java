package com.rabobank.bankapplication.controller;

import com.rabobank.bankapplication.model.Account;
import com.rabobank.bankapplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requester-Type", exposedHeaders = "X-Get-Header")
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accounts = accountService.getAccounts();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<Account> getAccount(@PathVariable Long accountId) {

        return new ResponseEntity<>(accountService.getAccountById(accountId), HttpStatus.OK);
    }

    public ResponseEntity<Account> saveAccount(@RequestBody Account account) {
        Account account1 = accountService.createNewAccount(account);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("account", "/api/account/" + account1.getId().toString());
        return new ResponseEntity<>(account1, httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{accountId}"})
    public ResponseEntity<Account> updateAccount(@PathVariable Long accountId, @RequestBody Account account) {
        accountService.updateAccount(accountId, account);
        return new ResponseEntity<>(accountService.getAccountById(accountId), HttpStatus.OK);
    }

    @DeleteMapping({"/{accountId}"})
    public ResponseEntity<Account> deleteAccount(@PathVariable Long accountId) {
        accountService.deleteAccountById(accountId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
