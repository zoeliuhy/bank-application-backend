package com.rabobank.bankapplication.controller;

import com.rabobank.bankapplication.model.Transaction;
import com.rabobank.bankapplication.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requester-Type", exposedHeaders = "X-Get-Header")
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getTransactions();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransaction(@PathVariable Long id) {

        return new ResponseEntity<>(transactionService.getTransactionById(id), HttpStatus.OK);
    }

    public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction transaction) {
        Transaction transaction1 = transactionService.createNewTransaction(transaction);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("transaction", "/api/transaction/" + transaction1.getId().toString());
        return new ResponseEntity<>(transaction1, httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Transaction> updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        transactionService.updateTransaction(id, transaction);
        return new ResponseEntity<>(transactionService.getTransactionById(id), HttpStatus.OK);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Transaction> deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransactionById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
