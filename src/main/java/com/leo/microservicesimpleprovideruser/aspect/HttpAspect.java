package com.leo.microservicesimpleprovideruser.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 切面类
 */
@Aspect
@Component
public class HttpAspect {


    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    /**
     * 生成一个切点方法
     */
    @Pointcut("execution(public * com.leo.microservicesimpleprovideruser.controller.UserController.*(..))")
    public void log(){

    }

    /**
     * 方法之前执行
     * 1.为什么不能直接获取servletrequest
     */
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){

        logger.info("======请求的数据为========");
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //请求路径
        logger.info("请求路径:{}",request.getRequestURL());
        //请求方式
        logger.info("请求方式:{}",request.getMethod());
        //客户的ip
        logger.info("请求IP:{}",request.getRemoteAddr());
        //请求的类方法
        logger.info("请求的类名:{},请求的方法名:{}",joinPoint.getSignature().getDeclaringTypeName(),joinPoint.getSignature().getName());
        //请求参数
        logger.info("请求的参数为:{}",joinPoint.getArgs());
    }


    @After("log()")
    public void doAfter(){
        logger.info("====返回的数据为====");

    }

    /**
     * 返回的参数
     * @param obj
     */
    @AfterReturning(returning = "obj", pointcut = "log()")
    public void doAfterReturning(Object obj){
        logger.info("response:{}",obj.toString());
    }





    
}
