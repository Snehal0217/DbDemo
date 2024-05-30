package com.example.DbDemo.service;

import com.example.DbDemo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User updateUser(User user);
    void deleteUser(Long id);

}
