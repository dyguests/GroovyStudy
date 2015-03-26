package com.fanhl.test.t2015.t02.t20150227

class D {
    @Delegate
    A a = new A()
}

class A {
    @Delegate
    B b = new B()
    int e=4
}

class B {
    int c = 3
}

println new D().e
println new D().c//err