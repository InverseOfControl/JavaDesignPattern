package com.gaohx.pattern.proxy;

/**
 * JDK 动态代理
 */
public class MyProxyTest {
    public static void main(String[] args) {
        Animal person = new MyProxy<>(new Person()).getInstance();
        person.display();
    }
}
