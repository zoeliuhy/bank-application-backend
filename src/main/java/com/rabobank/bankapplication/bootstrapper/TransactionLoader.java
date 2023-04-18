package com.rabobank.bankapplication.bootstrapper;

import com.rabobank.bankapplication.model.Transaction;
import com.rabobank.bankapplication.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TransactionLoader implements CommandLineRunner {
    @Autowired
    public TransactionRepo transactionRepo;

    @Override
    public void run(String... args) throws Exception {
        loadTransactions();
    }

    private void loadTransactions() {
        if(transactionRepo.count() == 0) {
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 04")
                            .title("AH to go")
                            .amount("-15")
                            .description("Buy bread * 1 & sap * 1")
                            .accountId(1L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 10")
                            .title("Receive tikkie")
                            .amount("+100")
                            .description("Receive tikkie from Amy L.")
                            .accountId(1L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 28")
                            .title("Salary")
                            .amount("+1500")
                            .description("Receive salary from Rabobank")
                            .accountId(1L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 28")
                            .title("Rent")
                            .amount("-1000")
                            .description("Transfer rent to Amy L.")
                            .accountId(1L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 10")
                            .title("Withdraw")
                            .amount("-1000")
                            .description("Withdraw to Debit Account")
                            .accountId(2L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 28")
                            .title("Deposit")
                            .amount("+1500")
                            .description("Deposit from Debit Account")
                            .accountId(2L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 28")
                            .title("Deposit")
                            .amount("+1000")
                            .description("Deposit from Debit Account")
                            .accountId(2L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 28")
                            .title("Withdraw")
                            .amount("-1000")
                            .description("Withdraw to Debit Account")
                            .accountId(2L)
                            .build()
            );
        }
    }
}