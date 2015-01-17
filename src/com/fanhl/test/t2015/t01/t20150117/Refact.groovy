package com.fanhl.test.t2015.t01.t20150117

class A {
    def name

    def getType() { println "反射好爽!11" }
}

A a = new A(name: "这是个参数")

println a."name"
a."getType"