package com.atguigu.springjpa.repository;

import com.atguigu.springjpa.entity.admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<admin ,Integer> {
}
