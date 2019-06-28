package com.atguigu.springjpa.repository;

import com.atguigu.springjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
