package com.gaohx.pattern.decorator;

/**
 * 装饰器模式测试
 * BufferedInputStrea 就是对 InputStream的装饰
 *
 * 装饰器模式就是为了增强被装饰对象的功能。所以装饰器类中必须拥有被装饰着的实例对象
 * 它的接口必须是被装饰者的接口
 * 总结：接口不变，拥有实例，新增功能
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Person person = new ZhangSanDecorator(new ZhangSan());
        person.eat();
    }
}
