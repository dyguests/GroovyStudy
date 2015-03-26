package com.fanhl.test.t2015.t03.t20150320

class A implements B, C, D {
    int a = 1
}

trait B {
    int b = 2
}

trait C {
    int c = 3
}

trait D {
    int d = 4
}

A a=new A()
println a.a+a.b+a.c+a.d
B b=a
println b.b
C c=b
println c.c
D d= ((D) c)
println d.d

assert a instanceof A
assert a instanceof B
assert a instanceof C
assert a instanceof D