package com.fanhl.test.t2015.t01.t20150117

class A {
    def param
    def method() { println "反射的方法" }
}

A a = new A(param: "这是个参数")

println a."param"
a.&"method"()