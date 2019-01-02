package com.leo.microservicesimpleprovideruser.controller;

import com.leo.microservicesimpleprovideruser.domain.User;
import com.leo.microservicesimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
  * @Company    不如吃茶去
  * @Author      郭志学
  * @Date        2018/11/28
  * @Version     1.0
  * @Description TODO 用户类
  */
@RestController
public class UserController {

    @Autowired
    private UserService service;


    /**
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

    /**
     * 添加一个用户
     */
    @RequestMapping("/addUser")
    // @Valid 表示验证这个类里面加上@Min的信息
    public String addUser(@Valid User user, BindingResult result){
        // 判断如果有拦截则提示谭姐上面的拦截信息
        if (result.hasErrors()){
            String message = result.getFieldError().getDefaultMessage();
            return message;
        }
        String returnMsg = "网络异常,请稍后重试!";
        try {
            returnMsg = service.addUser(user);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return returnMsg;
    }


}
