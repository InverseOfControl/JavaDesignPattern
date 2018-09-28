package com.gaohx.pattern.factory.method;

import com.gaohx.pattern.factory.Product;
import com.gaohx.pattern.factory.ProductB;

public class ProductBFactory extends MethodFactory {
    @Override
    public Product product() {
        return new ProductB();
    }
}
