package com.fanhl.test.t2015.t12.t20151229;

/**
 * Created by fanhl on 15/12/29.
 */
public class Singleton {
    private static class SingletonHolder {        //使用内部类
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}

class Singleton2 {

    public static final Singleton instance;

    static {
        instance = new Singleton();
    }


    public static Singleton getInstance() {
        return instance;
    }
}
