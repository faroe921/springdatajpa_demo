package com.fro.springdatajpa_demo.service;

import com.fro.springdatajpa_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Nino
 * @Date: 2024/12/13 - 12 - 13 - 上午1:36
 * @Description: com.fro.springdatajpa_demo.controller
 * @version: 1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
