package com.will.aop.springAopDemo.service.impl;

import com.will.aop.springAopDemo.entity.User;
import com.will.aop.springAopDemo.annotation.Log;
import com.will.aop.springAopDemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public int save(User user) {
        LOGGER.info("保存User");
        return 1;
    }

    @Override
    public User find() {
        LOGGER.info("查找所有用户");
        return new User();
    }
}
