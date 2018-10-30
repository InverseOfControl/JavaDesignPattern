package com.gaohx.pattern.chain;

public class ResponsibilityHandler implements Handler {

    private Handler handler;

    public ResponsibilityHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Boy boy) {

        if (boy.isHasResponsibility()) {
            System.out.println("有责任心");
        } else {
            System.out.println("没责任心");
            handler.handleRequest(boy);
        }
    }
}
