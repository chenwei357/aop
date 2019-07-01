package com.will.aop.springAopDemo.service;

import com.will.aop.springAopDemo.entity.User;

public interface UserService {

    int save(User user);

    User find();

}
