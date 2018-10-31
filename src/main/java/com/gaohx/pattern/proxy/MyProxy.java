package com.gaohx.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy<T> implements InvocationHandler {
    private final Animal target;

    public MyProxy(Person person) {
        this.target = person;
    }

    public <T> T getInstance() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前");
        method.invoke(target,args);
        System.out.println("执行后");
        return null;
    }
}
