package com.gaohx.pattern.factory.simple;

import com.gaohx.pattern.factory.Product;

public class SimpleFactoryTest {

    /**
     * 简单工厂 耦合度高，如果在新增一个产品C，还需要去修改工厂
     * @param args
     */
    public static void main(String[] args) {
        String type = "B";
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.product(type);
        product.getName();
    }

}
