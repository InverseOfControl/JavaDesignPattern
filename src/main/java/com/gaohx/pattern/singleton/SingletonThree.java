package com.gaohx.pattern.singleton;

/**
 * double check locking
 * 双检查所并不能保证单例，必须要把引用声明为 volatile
 */
public class SingletonThree {
    private static volatile Person person;
    public static Person getInstance(){
        if (null == person) {
            synchronized (SingletonThree.class){
                if(null == person){
                    person = new Person();
                }
            }
        }
        return person;
    }
}
