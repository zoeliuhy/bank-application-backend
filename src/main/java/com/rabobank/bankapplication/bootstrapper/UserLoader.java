package com.rabobank.bankapplication.bootstrapper;

import com.rabobank.bankapplication.model.User;
import com.rabobank.bankapplication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserLoader implements CommandLineRunner {
    @Autowired
    public UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {
        loadUsers();
    }

    private void loadUsers() {
        if(userRepo.count() == 0) {
            userRepo.save(
                    User.builder()
                            .username("John S.")
                            .password("john123")
                            .name("John Superhuman SuperLongName")
                            .email("john.s@gmail.com")
                            .address("Wilhelminastraat 84 Papendrecht Zuid-Holland 3351 AV Netherlands")
                            .phone("+31 06-67916391")
                            .build()
            );
        }
    }
}
