package com.gaohx.pattern.factory;

public class ProductC implements Product {
    @Override
    public void getName() {
        System.out.println("ProductC.getName");
    }
}
