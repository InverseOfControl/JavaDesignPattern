package com.gaohx.pattern.listener;

import java.util.EventListener;

public interface MyEventListener extends EventListener {

    void handleEvent(MyEventObject eventObject);

}
