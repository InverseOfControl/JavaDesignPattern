package com.gaohx.pattern.strategy;

/**
 * 策略模式：算法的平等性
 * 在运行期间可动态替换算法
 */
public class StrategyTest {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new BStrategy());
        context.travel();
    }

}
