package com.gaohx.pattern.proxy;

public class Person implements Animal{
    @Override
    public void display() {
        System.out.println("人");
    }
}
