package com.atguigu.springjpa.controller;

import com.atguigu.springjpa.entity.User;
import com.atguigu.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    
    @GetMapping("/user/{id}")
    public User find(@PathVariable("id") Integer id){
        User one = userRepository.findOne(id);
        return one;
    }
}
