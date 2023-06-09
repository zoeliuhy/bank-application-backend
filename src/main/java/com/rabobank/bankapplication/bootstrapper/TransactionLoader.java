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
                            .title("AH")
                            .amount(-20.90)
                            .description("Buy bread, yogurt, vegetables...")
                            .accountId(1L)
                            .categoryId(3L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 06")
                            .title("Donation")
                            .amount(-25.00)
                            .description("Donation to food bank")
                            .accountId(1L)
                            .categoryId(7L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 10")
                            .title("NS")
                            .amount(-25.00)
                            .description("NS day trip ticket")
                            .accountId(1L)
                            .categoryId(1L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 11")
                            .title("NS")
                            .amount(-4.50)
                            .description("OV bike")
                            .accountId(1L)
                            .categoryId(1L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 12")
                            .title("H&M")
                            .amount(-25.00)
                            .description("Buy clothes")
                            .accountId(1L)
                            .categoryId(2L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 15")
                            .title("Snack bar")
                            .amount(-15.00)
                            .description("Have snacks: fries, drinks")
                            .accountId(1L)
                            .categoryId(6L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 16")
                            .title("Vapiano")
                            .amount(-20.00)
                            .description("Have a dinner")
                            .accountId(1L)
                            .categoryId(6L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 18")
                            .title("Mobile fee")
                            .amount(-13.00)
                            .description("Monthly mobile fee")
                            .accountId(1L)
                            .categoryId(4L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 20")
                            .title("Insurance")
                            .amount(-130.00)
                            .description("Health insurance")
                            .accountId(1L)
                            .categoryId(5L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 20")
                            .title("Vapiano")
                            .amount(-30.00)
                            .description("Have a dinner")
                            .accountId(1L)
                            .categoryId(6L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 28")
                            .title("Income")
                            .amount(2150.55)
                            .description("Receive $$ from Rabobank")
                            .accountId(1L)
                            .categoryId(8L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 03")
                            .title("Jumbo")
                            .amount(-80.00)
                            .description("Jumbo")
                            .accountId(2L)
                            .categoryId(3L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 06")
                            .title("Internet Fee")
                            .amount(-10.00)
                            .description("Monthly internet fee")
                            .accountId(2L)
                            .categoryId(4L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 19")
                            .title("Insurance")
                            .amount(-18.80)
                            .description("House insurance")
                            .accountId(2L)
                            .categoryId(4L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 25")
                            .title("Noodle bar")
                            .amount(-33.00)
                            .description("Have dinner")
                            .accountId(2L)
                            .categoryId(6L)
                            .build()
            );
            transactionRepo.save(
                    Transaction.builder()
                            .date("Mar 28")
                            .title("Expenses")
                            .amount(-1889.00)
                            .description("Transfer $$ to Amy L.")
                            .accountId(2L)
                            .categoryId(4L)
                            .build()
            );
        }
    }
}