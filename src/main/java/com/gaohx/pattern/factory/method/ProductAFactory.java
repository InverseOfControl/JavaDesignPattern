package com.gaohx.pattern.factory.method;

import com.gaohx.pattern.factory.Product;
import com.gaohx.pattern.factory.ProductA;

public class ProductAFactory extends MethodFactory {
    @Override
    public Product product() {
        return new ProductA();
    }
}
