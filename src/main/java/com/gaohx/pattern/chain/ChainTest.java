package com.gaohx.pattern.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式
 * 多个处理器处理同一个请求
 */
public class ChainTest {
    public static void main(String[] args) {
        List<Handler> handlerList = new ArrayList<>();
        Boy boy = new Boy();
        boy.setHasCar(false);
        boy.setHasHouse(false);
        boy.setHasResponsibility(true);
        Handler handler = new CarHandler(new HouseHandler(new ResponsibilityHandler(null)));
        handler.handleRequest(boy);
    }
}
