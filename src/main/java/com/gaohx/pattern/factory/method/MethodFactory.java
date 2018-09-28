package com.gaohx.pattern.factory.method;

import com.gaohx.pattern.factory.Product;

/**
 * 工厂生产产品
 */
public abstract class MethodFactory {

    /**
     * 工厂方法
     * @return
     */
    abstract Product product();

}
