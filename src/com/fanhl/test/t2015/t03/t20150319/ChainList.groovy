package com.fanhl.test.t2015.t03.t20150319

/**
 * 链条List
 * 每个元素都可以前后关联
 *
 * Created by fanhl on 15/3/19.
 */
class ChainList<E extends Chainable> extends ArrayList<E> {

    @Override
    public boolean add(E object) {
        if (getLast() != null) {
            getLast().setNext(object)
            object.setPrev(getLast())
        }

        return super.add(object)
    }

    @Override
    public E remove(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index " + index + ", size is " + size())
        }

        E current = get(index)

        //前后都为空时不处理
        if (current.getPrev() != null && current.getNext() != null) {
            current.getPrev().setNext(current.getNext())
            current.getNext().setPrev(current.getPrev())
        } else if (current.getPrev() == null && current.getNext() != null) {
            current.getNext().setPrev(null)
        } else if (current.getPrev() != null && current.getNext() == null) {
            current.getPrev().setNext(null)
        }


        return super.remove(index)
    }

    public E getLast() {
        return size() == 0 ? null : get(size() - 1)
    }

    static trait Chainable<T extends Chainable> {
        T prev, next
//
//        T getPrev() { prev }
//
//        void setPrev(T t) { prev = t }
//
//        T getNext() { next }
//
//        void setNext(T t) { next = t }
    }
}

//trait Chainable<T extends Chainable> {
//    T prev, next
//
//    T getPrev() { prev }
//
//    void setPrev(T t) { prev = t }
//
//    T getNext() { next }
//
//    void setNext(T t) { next = t }
//}