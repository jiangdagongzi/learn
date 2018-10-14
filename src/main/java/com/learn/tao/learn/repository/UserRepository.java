package com.learn.tao.learn.repository;

import com.learn.tao.learn.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    /**
     *
     * @return
     */
    List<User> queryUser();

    /**
     *
     * @param userId
     * @return
     */
    User queryUserById(int userId);

    /**
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     *
     * @param userId
     * @param user
     * @return
     */
    int updateUser(int userId,User user);

    /**
     *
     * @param userId
     * @return
     */
    int deleteUser(int userId);


//    int deleteUser(String userName);
}
