package com.gaohx.pattern.singleton;

/**
 * 饿汉模式
 * 通过JVM对类的加载时机 保证了其单例
 */
public class SingletonOne {
    private static Person person = new Person();
    public Person getInstance(){
        return person;
    }

    static class Person{}
}
