package com.fanhl.test.t2015.t12.t20151229;

/**
 * Created by fanhl on 15/12/29.
 */
public class DoubleLock {
    private static DoubleLock instance;

    public static DoubleLock getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new DoubleLock();
                }
            }
        }
        return instance;
    }

    private DoubleLock() {
    }

    public void methodA() {
        //...
    }
}
