package com.gaohx.pattern.chain;

public class CarHandler implements Handler {

    private Handler handler;

    public CarHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Boy boy) {

        if (boy.isHasCar()) {
            System.out.println("有车");
        } else {
            System.out.println("没车");
            handler.handleRequest(boy);
        }
    }
}
