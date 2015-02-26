package com.fanhl.test.t2015.t01.t20150123

trait A {
    int a
}

trait B {
    int b
}

class C implements A, B {
    int c

    def call() { println "$a $b ${this.c}" }
}

def c = new C()

c.c=3
c.call()