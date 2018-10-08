package com.learn.tao.learn.controller;

import com.learn.tao.learn.entity.User;
import com.learn.tao.learn.service.UserService;
import com.learn.tao.learn.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/login",method = RequestMethod.GET)
//    private
}
