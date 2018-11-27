package com.leo.microservicesimpleprovideruser.service.impl;

import com.leo.microservicesimpleprovideruser.domain.User;
import com.leo.microservicesimpleprovideruser.mapper.UserMapper;
import com.leo.microservicesimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    @Override
    public User findById() {//Long id
        User user = mapper.findById();
        return user;
    }
}
