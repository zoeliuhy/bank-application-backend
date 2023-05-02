package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getUsers();

    User getUserById(Long userId);
}
