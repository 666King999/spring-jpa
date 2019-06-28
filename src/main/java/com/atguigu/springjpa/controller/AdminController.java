package com.atguigu.springjpa.controller;

import com.atguigu.springjpa.entity.admin;
import com.atguigu.springjpa.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminRepository adminRepository;
    @GetMapping("admin/{id}")
    public admin findAdmin(@PathVariable("id")Integer id){
        admin admin = adminRepository.findOne(id);
        return admin;
    }
}
