package com.leo.microservicesimpleprovideruser.controller;

import com.leo.microservicesimpleprovideruser.domain.User;
import com.leo.microservicesimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户类
 * @User Guo_zzzx
 * @date 2018-11-27
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;

    /**
     * 根据用户输入Id查询用户信息
     * @param id
     * @return User
     */
    @RequestMapping("/user")
    public User findById(){//@PathVariable Long id
        User user = service.findById();//id
        return user;
    }
}
