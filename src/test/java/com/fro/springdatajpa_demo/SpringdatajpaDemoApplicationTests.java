package com.fro.springdatajpa_demo;

import com.fro.springdatajpa_demo.entity.User;
import com.fro.springdatajpa_demo.service.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringdatajpaDemoApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        User user = new User(null, "fro", "china", "female");
        userRepository.save(user);
    }
}
