package com.example.DbDemo.dao;

import com.example.DbDemo.entity.User;
import com.example.DbDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private UserRepository userRepository;

    @Autowired
    public UserDao(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getByid(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
