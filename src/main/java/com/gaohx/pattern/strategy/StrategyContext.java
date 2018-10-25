package com.gaohx.pattern.strategy;

public class StrategyContext {

    private AbstractStrategy strategy;

    public StrategyContext(AbstractStrategy strategy){
        this.strategy = strategy;
    }

    public void travel(){
        this.strategy.travel();
    }

}
