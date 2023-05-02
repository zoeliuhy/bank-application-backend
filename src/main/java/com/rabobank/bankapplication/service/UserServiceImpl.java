package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.User;
import com.rabobank.bankapplication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getUsers() {

        return userRepo.findAll();
    }
    @Override
    public User getUserById(Long userId) {

        return userRepo.findById(userId).get();
    }
}
