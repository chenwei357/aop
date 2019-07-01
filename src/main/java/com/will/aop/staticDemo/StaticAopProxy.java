package com.will.aop.staticDemo;

/**
 * 静态代理
 * 特点:
 *      1.目标对象必须实现接口
 *      2.代理对象,要实现与目标对象一样的接口
 */
public class StaticAopProxy implements UserDao {

    private UserDao target = new UserDaoImpl();

    public void save() {
        System.out.println("代理操作开始...");
        target.save();
        System.out.println("代理操作结束...");
    }

    public void find() {
        target.find();
    }

    public static void main(String[] args) {
        //代理对象
        StaticAopProxy proxy = new StaticAopProxy();
        //执行代理方法
        proxy.save();
    }

}
