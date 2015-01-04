package com.fanhl.test.s6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by fanhl on 15/1/4.
 */
public class JavaArrayList {
    public static void main(String[] args) {
        List<String> aList = new MyArrayList<String>();
        aList.add("This");
        aList.add("is");
        aList.add("Spadaaaaaa");

        for (String s : aList) {
            System.out.println(s.toUpperCase());
        }

        aList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        });

        aList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        });

        aList.forEach((String s) -> System.out.println(s.toUpperCase()));
    }
}

class MyArrayList<T> extends ArrayList<T> {
    public void each(TCallback<T> ttCallback) {
        for (int i = 0; i < size(); i++) {
            T t = get(i);
            ttCallback.callback(t);
        }
    }

    public static interface TCallback<T> {
        void callback(T t);
    }
}