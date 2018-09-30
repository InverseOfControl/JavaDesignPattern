package com.gaohx.pattern.listener;

import java.util.ArrayList;
import java.util.EventListener;

public class MyEventSource implements EventListener {

    private static final ArrayList<MyEventListener> listenerList = new ArrayList<>();

    public void addListener(MyEventListener eventListener) {
        listenerList.add(eventListener);
    }

    public void event(MyEventObject eventObject) {
        for (MyEventListener myEventListener : listenerList) {
            myEventListener.handleEvent(eventObject);
        }
    }

}
