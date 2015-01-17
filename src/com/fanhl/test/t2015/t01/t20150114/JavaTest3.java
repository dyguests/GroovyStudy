package com.fanhl.test.t2015.t01.t20150114;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanhl on 15/1/14.
 */
public class JavaTest3 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("This");
        lst.add("is");
        lst.add("Sparta");

        lst.forEach(System.out::println);//need java8

        lst.forEach(String::toUpperCase);
    }
}
