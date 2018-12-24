package com.leo.microservicesimpleprovideruser.service.impl;

import com.leo.microservicesimpleprovideruser.Utils.ConstantVar;
import com.leo.microservicesimpleprovideruser.domain.User;
import com.leo.microservicesimpleprovideruser.mapper.UserMapper;
import com.leo.microservicesimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
  * @Company     一生温暖纯良 不舍爱与自由
  * @Author      郭志学
  * @Date        2018/11/28
  * @Version     1.0
  * @Description TODO 业务层
  */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    /***
     * 描述:根据用户Id获取用户信息<功能详细描述>
     * @Params [id]
     * @return User
     */
    @Override
    public User findById(Long id) {
        User user = mapper.findById(id);
        return user;
    }

    /**
     * 添加一个用户
     * @param user
     * @return
     */
    @Override
    public String addUser(@Valid User user) {
        int i = mapper.addUser(user);
        if (i>0) {
            return ConstantVar.ADD_MESSAGE_YES;
        } else {
            return ConstantVar.ADD_MESSAGE_NO;
        }
    }
}
