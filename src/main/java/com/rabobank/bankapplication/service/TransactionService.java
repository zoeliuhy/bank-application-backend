package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {

    List<Transaction> getTransactions();

    List<Transaction> getTransactionsByAccountId(Long accountId);

    Transaction getTransactionById(Long id);

    Transaction createNewTransaction(Transaction transaction);

    void updateTransaction(Long id, Transaction transaction);

    void deleteTransactionById(Long id);


}
