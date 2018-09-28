package com.gaohx.pattern.factory;

public class ProductB implements Product {
    @Override
    public void getName() {
        System.out.println("ProductB.getName");
    }
}
