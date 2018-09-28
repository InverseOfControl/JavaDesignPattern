package com.gaohx.pattern.factory.abstraction;

import com.gaohx.pattern.factory.ProductA;
import com.gaohx.pattern.factory.ProductB;

public interface AbstractFactory {

    ProductA productA();

    ProductB productB();

}
