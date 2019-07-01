package com.will.aop.springAopDemo;

import com.will.aop.springAopDemo.config.Config;
import com.will.aop.springAopDemo.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringAOP {

    @Test
    public void testAop() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.find();
    }

}
