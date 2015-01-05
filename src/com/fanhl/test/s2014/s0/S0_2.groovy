package com.fanhl.test.s2014.s0

/**
 * Created by fanhl on 14/12/30.
 */
class S0_2 {
    public static void main(String[] args) {
        10.times { println delegate }

        //3
        String.metaClass.isPalindrome = { -> delegate == delegate.reverse() }
        println "fuuuuf".isPalindrome()
        println "fuuuuk".isPalindrome()


    }
}
