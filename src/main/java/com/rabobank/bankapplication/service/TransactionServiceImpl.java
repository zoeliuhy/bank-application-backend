package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.Transaction;
import com.rabobank.bankapplication.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepo transactionRepo;

    @Override
    public List<Transaction> getTransactions() {

        return transactionRepo.findAll();
    }

    @Override
    public List<Transaction> getTransactionsByAccountId(Long accountId) {
        return transactionRepo.findTransactionsByAccountId(accountId);
    }
    @Override
    public Transaction getTransactionById(Long id) {

        return transactionRepo.findById(id).get();
    }

    @Override
    public Transaction createNewTransaction(Transaction transaction) {


        return transactionRepo.save(transaction);
    }

    @Override
    public void updateTransaction(Long id, Transaction transaction) {
        Transaction transactionFromDb = transactionRepo.findById(id).get();
        System.out.println(transactionFromDb.toString());
        transactionFromDb.setDate(transaction.getDate());
        transactionFromDb.setTitle(transaction.getTitle());
        transactionFromDb.setAmount(transaction.getAmount());
        transactionFromDb.setDescription(transaction.getDescription());
        transactionFromDb.setAccountId(transaction.getAccountId());
        transactionRepo.save(transactionFromDb);
    }

    @Override
    public void deleteTransactionById(Long id) {
        transactionRepo.deleteById(id);
    }

}
