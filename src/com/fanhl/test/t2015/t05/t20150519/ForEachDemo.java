package com.fanhl.test.t2015.t05.t20150519;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by fanhl on 15/5/19.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Fuck");
        list.add("You");

        Consumer<String> println = System.out::println;
        list.forEach(println);
    }
}
