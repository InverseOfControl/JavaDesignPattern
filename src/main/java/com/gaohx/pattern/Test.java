package com.gaohx.pattern;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass("com.gaohx.pattern.factory.ProductA");
            Object obj = clazz.newInstance();

            Method[] methods = obj.getClass().getDeclaredMethods();
            for (Method method : methods) {
                method.invoke(obj,null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
