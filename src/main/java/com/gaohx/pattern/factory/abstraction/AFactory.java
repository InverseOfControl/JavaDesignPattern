package com.gaohx.pattern.factory.abstraction;

import com.gaohx.pattern.factory.ProductA;
import com.gaohx.pattern.factory.ProductB;

public class AFactory implements AbstractFactory {

    @Override
    public ProductA productA() {
        return new ProductA();
    }

    @Override
    public ProductB productB() {
        return new ProductB();
    }
}
