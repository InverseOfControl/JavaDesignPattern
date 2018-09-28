package com.gaohx.pattern.factory.method;

import com.gaohx.pattern.factory.Product;

public class MethodFactoryTest {

    /**
     * 方法工厂是一个接口或抽象类，目的就是在生产产品的时候，由子类去决定要生产什么产品。
     * 如果在新增一个产品C，只需继承工厂，由具体的工厂去生产具体的产品。
     * 符合“对修改关闭，对扩展开放的原则”
     * 但是，如果后期新增很多产品，对导致类爆炸。
     * @param args
     */
    public static void main(String[] args) {
        Product product = new ProductAFactory().product();
        product.getName();
    }

}
