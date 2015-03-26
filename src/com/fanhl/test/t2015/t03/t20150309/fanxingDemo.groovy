package com.fanhl.test.t2015.t03.t20150309

class ClassA<B extends BaseClassB> {
    def bPrint() { new B().print() }
}

class BaseClassB {
    def print() { println "BaseClassB B print!!" }
}

class ClassB {
    def print() { println "Class B print!!" }
}

new ClassA<ClassB>().bPrint()