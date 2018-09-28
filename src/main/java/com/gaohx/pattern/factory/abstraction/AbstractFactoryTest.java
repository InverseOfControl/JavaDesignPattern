package com.gaohx.pattern.factory.abstraction;

import com.gaohx.pattern.factory.Product;

public class AbstractFactoryTest {

    /**
     * 抽象工厂
     * 1.理解产品族（苹果有iphone6,iphone7等等；华为p10,p20。现在苹果和华为就是两个产品族。）
     * 2.由抽象工厂得到具体的工厂
     * AFactory生产iphone6,p10; BFactory生产iphone7,p20;
     * @param args
     */
    public static void main(String[] args) {
        AbstractFactory factory = new AFactory();
        Product product = factory.productA();
        product.getName();

    }

}
