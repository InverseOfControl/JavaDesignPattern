package com.gaohx.pattern.strategy;

public class AStrategy implements AbstractStrategy {
    @Override
    public void travel() {
        System.out.println("AStrategy.travel");
    }
}
