package com.gaohx.pattern.decorator;

public class ZhangSanDecorator implements Person{

    private Person person;

    public ZhangSanDecorator(Person person){
        this.person = person;
    }

    @Override
    public void eat() {
        System.out.println("ZhangSanDecorator.eat");
        person.eat();
        System.out.println("ZhangSanDecorator.eat");
    }

}
