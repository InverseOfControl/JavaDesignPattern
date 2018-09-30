package com.gaohx.pattern.listener;

import java.util.EventObject;

public class MyEventObject extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyEventObject(Object source) {
        super(source);
    }

    public void click(){
        System.out.println("MyEventObject.click");
    }
}
