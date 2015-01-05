package com.fanhl.test.t2015.t01.t20150105;

import java.util.ArrayList;

/**
 * @param <E>
 *
 * Created by fanhl on 15/1/5.
 */
public class NodeList<E extends NodeList.Nodeable> extends ArrayList<E> {

    @Override
    public boolean add(E object) {
        if (getLast() != null) {
            getLast().setNext(object);
            object.setPre(getLast());
        }

        return super.add(object);
    }

    private E getLast() {
        return size() == 0 ? null : get(size() - 1);
    }

    /**
     * @param <T> 此处为实现这个接口的类 如: class ClassA implements Nodeable<ClassA>{...}
     */
    public static interface Nodeable<T> {
        T getPre();

        void setPre(T t);

        T getNext();

        void setNext(T t);
    }
}
