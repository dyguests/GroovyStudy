package com.fanhl.test.t2015.t01.t20150124

def lst = ["123", "2345", "12345"]
def sizes = lst*.size()
println sizes

class A{
    int i
    int getI() { this.i * this.i }
}

def a = new A(i: 12)
println a.i
println a.@i
