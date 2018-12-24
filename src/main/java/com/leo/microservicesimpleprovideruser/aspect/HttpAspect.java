package com.leo.microservicesimpleprovideruser.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面类
 */
@Aspect
@Component
public class HttpAspect {
    // 拦截这个方法之前的所有请求
    @Before("execution(public * com.leo.microservicesimpleprovideruser.controller.*")
    public void log(){
        System.out.println("切面方法之前...");
    }
}
