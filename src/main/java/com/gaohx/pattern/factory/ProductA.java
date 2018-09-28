package com.gaohx.pattern.factory;

public class ProductA implements Product {
    @Override
    public void getName() {
        System.out.println("ProductA.getName");
    }
}
