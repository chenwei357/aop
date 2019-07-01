package com.will.aop.springAopDemo;

import com.will.aop.springAopDemo.entity.User;
import com.will.aop.springAopDemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void save(){
        User user = new User();
        user.setUserName("will.chen");
        user.setPassword("123456");
        userService.save(user);
    }

}
