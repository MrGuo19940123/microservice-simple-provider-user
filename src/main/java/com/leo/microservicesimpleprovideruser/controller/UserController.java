package com.leo.microservicesimpleprovideruser.controller;

import com.leo.microservicesimpleprovideruser.domain.User;
import com.leo.microservicesimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @Company     一生温暖纯良 不舍爱与自由
  * @Author      郭志学
  * @Date        2018/11/28
  * @Version     1.0
  * @Description TODO 用户类
  */
@RestController
public class UserController {

    @Autowired
    private UserService service;


    /***
     * 描述:根据用户ID获取用户信息<功能详细描述>
     * @Params []
     * @return User
     */
    @RequestMapping("/{id}")
    //@PathVariable:可以用来映射URL中的占位符到目标方法的参数中
    public User findById(@PathVariable Long id){
        User user = service.findById(id);
        return user;
    }
}
