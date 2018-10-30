package com.gaohx.pattern.chain;

public class HouseHandler implements Handler {

    private Handler handler;

    public HouseHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Boy boy) {

        if (boy.isHasHouse()) {
            System.out.println("有房");
        } else {
            System.out.println("没房");
            handler.handleRequest(boy);
        }
    }
}
