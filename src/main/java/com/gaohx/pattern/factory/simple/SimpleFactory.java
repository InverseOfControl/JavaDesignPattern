package com.gaohx.pattern.factory.simple;

import com.gaohx.pattern.factory.Product;
import com.gaohx.pattern.factory.ProductA;
import com.gaohx.pattern.factory.ProductB;

public class SimpleFactory {

    public Product product(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if (type.equals("B")) {
            return new ProductB();
        } else {
            return null;
        }
    }

}
