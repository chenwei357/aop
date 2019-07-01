package com.will.aop.dynamicDemo;

import com.will.aop.staticDemo.UserDao;
import com.will.aop.staticDemo.UserDaoImpl;
import sun.misc.ProxyGenerator;

import java.lang.reflect.Proxy;

/**
 * 代理工厂,给多个目标对象生成代理对象
 */
public class DynamicAop {

    private Object target;

    public DynamicAop(Object target) {
        this.target = target;
    }

    //返回对目标对象(target)代理后的对象(proxy)
    public Object getProxyInstance() {
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (object, method, args) -> {
                    String methodName = method.getName();
                    Object result = null;
                    if ("find".equals(methodName)) {
                        result = method.invoke(target, args);
                    }else if ("save".equals(methodName)) {
                        System.out.println("代理操作开始...");
                        result = method.invoke(target, args);
                        System.out.println("代理操作结束...");
                    }
                    return result;
                });
        return proxy;
    }


    public static void main(String[] args) {
        UserDao target = new UserDaoImpl();
        System.out.println("目标对象: " + target.getClass());
        UserDao proxy = (UserDao) new DynamicAop(target).getProxyInstance();
        System.out.println("代理对象: " + proxy.getClass());
        //执行代理对象的方法
        proxy.save();
    }

}
