package com.fanhl.test.t2015.t01.t20150123

trait D {
    int a
}
trait E{
    int b
}

class F implements D, E {
    def call(){println "$a $b"}
}

def f = new F()
f.a=1
f.b=2
f.call()