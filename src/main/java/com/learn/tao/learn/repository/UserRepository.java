package com.learn.tao.learn.repository;

import com.learn.tao.learn.entity.User;

import java.util.List;

public interface UserRepository {
    List<User> queryUser();
    User queryUserById(int userId);
    int insertUser(User user);
    int updateUser(int userId,User user);
    int deleteUser(int userId);
//    int deleteUser(String userName);
}
