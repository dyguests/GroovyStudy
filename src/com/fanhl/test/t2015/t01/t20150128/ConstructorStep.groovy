package com.fanhl.test.t2015.t01.t20150128

class A{
    def A(){println "A"}
}

class B{
    def  a=new A()
    def B(){println "B"}
}

new B()