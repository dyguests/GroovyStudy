package com.fanhl.test.t2015.t01.t20150121;

/**
 * Created by fanhl on 15/1/21.
 */
public class Jdk8Test1 {
    public static void main(String[] args) {
        System.out.print(new PersonImpl().isMan());
    }
}


interface Person {
    Sex getSex();

    default boolean isMan() {
        return getSex() == Sex.MAN;
    }
}

enum Sex {MAN, WOMAN}

class PersonImpl implements Person {
    public Sex getSex() {
        return Sex.MAN;
    }
}