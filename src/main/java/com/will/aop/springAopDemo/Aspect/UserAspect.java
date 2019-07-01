package com.will.aop.springAopDemo.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAspect.class);

    @Pointcut("execution(* com.will.aop.springAopDemo.service.impl.UserServiceImpl.*(..))")
    public void webLog(){
    }

    @Before("webLog()")
    public void doBefore(){
        LOGGER.info("切面before执行...");
    }

    @After("webLog()")
    public void doAfter(){
        LOGGER.info("切面after执行...");
    }

    @AfterReturning("webLog()")
    public void doAfterReturning(){
        LOGGER.info("切面afterReturning执行...");
    }

    /*@Around("webLog()")
    public Object around(ProceedingJoinPoint joinpoint){
        *//*LOGGER.info("signature={}", joinpoint.getSignature().toString());
        LOGGER.info("Args={}", joinpoint.getArgs());
        LOGGER.info("kind={}", joinpoint.getKind());
        LOGGER.info("target={}", joinpoint.getTarget());*//*
        Object result = null;
        try {
            result = joinpoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }*/

}
