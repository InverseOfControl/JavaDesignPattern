package com.gaohx.pattern.decorator;

/**
 * 装饰器模式测试
 * BufferedInputStrea 就是对 InputStream的装饰
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Person person = new ZhangSanDecorator(new ZhangSan());
        person.eat();
    }
}
