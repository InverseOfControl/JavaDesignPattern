package com.gaohx.pattern.strategy;

public class BStrategy implements AbstractStrategy {
    @Override
    public void travel() {
        System.out.println("BStrategy.travel");
    }
}
