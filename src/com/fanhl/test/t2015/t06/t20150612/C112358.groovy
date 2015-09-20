package com.fanhl.test.t2015.t06.t20150612

def a = 1

1.upto(10) {
    a = a + 4**it
    println("$a + ${4**it}")
}