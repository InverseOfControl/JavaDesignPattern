package com.gaohx.pattern.singleton;


/**
 * 通过静态内部类实现 懒汉模式
 */
public class SingletonTwo {
    private static class ResourceLoader{
        public static Person person = new Person();
    }
    public  Person getInstance(){
        return ResourceLoader.person;
    }
}

class Person{}
