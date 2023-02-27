package com.rabobank.bankapplication;

import com.rabobank.bankapplication.models.User;
import com.rabobank.bankapplication.repos.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BankApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }


    @Bean
    CommandLineRunner init(UserRepo userRepo) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                userRepo.save(user);
            });
            userRepo.findAll().forEach(System.out::println);
        };
    }
}
