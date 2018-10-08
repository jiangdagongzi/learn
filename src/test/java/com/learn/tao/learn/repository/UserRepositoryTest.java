package com.learn.tao.learn.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void queryUser() {
    }

    @Test
    public void queryUserById() {
    }

    @Test
    public void insertUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }
}