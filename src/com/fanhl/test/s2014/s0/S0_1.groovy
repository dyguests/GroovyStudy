package com.fanhl.test.s2014.s0

/**
 * Created by fanhl on 14/12/30.
 */
class S0_1 {
    static void main(String[] args) {
        Integer.metaClass.percentRaise = { amount -> amount * (delegate + 100) / 100 }
        println 5.percentRaise(10000)
    }
}
