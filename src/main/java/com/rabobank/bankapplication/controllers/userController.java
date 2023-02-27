package com.rabobank.bankapplication.controllers;

import com.rabobank.bankapplication.models.User;
import com.rabobank.bankapplication.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class userController {
    public userController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    private final UserRepo userRepo;

    @GetMapping("/users")
    public List<User> getUserList() {
        return (List<User>) userRepo.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public User getUser(@PathVariable Long id) {
        return userRepo.findById(id).get();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepo.save(user);
    }
}
