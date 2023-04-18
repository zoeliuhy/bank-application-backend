package com.rabobank.bankapplication.bootstrapper;

import com.rabobank.bankapplication.model.Account;
import com.rabobank.bankapplication.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountLoader implements CommandLineRunner {
    @Autowired
    public AccountRepo accountRepo;

    @Override
    public void run(String... args) throws Exception {
        loadAccounts();
    }

    private void loadAccounts() {
        if(accountRepo.count() == 0) {
            accountRepo.save(
                    Account.builder()
                            .name("John S. #MyDebitAccount")
                            .email("john@gmail.com")
                            .iban("NL52RABO9323024236")
                            .balance(1000)
                            .build()
            );
            accountRepo.save(
                    Account.builder()
                            .name("John S. #MySavingAccount")
                            .email("john@gmail.com")
                            .iban("NL52RABO9323024237")
                            .balance(2000)
                            .build()
            );
        }
    }
}
