package com.gaohx.pattern.listener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Java的事件监听机制涉及到事件源，事件监听器，事件对象三个组件,监听器一般是接口，用来约定调用方式。
 * 当事件源对象上发生操作时，它将会调用事件监听器的一个方法，并在调用该方法时传递事件对象过去。
 * 事件监听器实现类,通常是由开发人员编写，开发人员通过事件对象拿到事件源，从而对事件源上的操作进行处理。
 * <p>
 * 事件监听器：监听事件，由于它是一个接口，真正的实现就是回调
 * 事件源（入口）：1.添加监听对象  2.发布事件并传递事件对象
 * 事件对象：只是事件对象，通过事件源传递到监听器中
 */
public class MyEventListenerTest {

    public static void main(String[] args) {
        MyEventSource myEventSource = new MyEventSource();
        myEventSource.addListener(new MyEventListener() {
            @Override
            public void handleEvent(MyEventObject eventObject) {
                try {
                    Method method = eventObject.getClass().getDeclaredMethod(eventObject.getSource().toString());
                    method.invoke(eventObject, null);
                } catch (Exception e) {
                }
            }
        });
        myEventSource.event(new MyEventObject("click"));
    }

}
