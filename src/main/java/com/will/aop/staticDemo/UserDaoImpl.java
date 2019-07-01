package com.will.aop.staticDemo;

public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("保存用户!");
    }

    public void find() {
        System.out.println("查找用户!");
    }
}
