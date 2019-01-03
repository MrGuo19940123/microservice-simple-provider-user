package com.leo.microservicesimpleprovideruser.Utils;

import com.leo.microservicesimpleprovideruser.domain.HttpResult;
import com.leo.microservicesimpleprovideruser.domain.User;

import java.util.Random;

public class CommonUtils {

    /**
     * 生成随机数
     */
    public static Integer getRandomNum(){
        Random random = new Random();
        return random.nextInt();
    }

    /**
     * 统一日志处理方法
     */
    public static HttpResult success(String code, String msg, User user){
        HttpResult response = new HttpResult();
        response.setInterfaceCode(code);
        response.setInterfaceMsg(msg);
        response.setInterfaceBody(user);
        return response;
    }
}
