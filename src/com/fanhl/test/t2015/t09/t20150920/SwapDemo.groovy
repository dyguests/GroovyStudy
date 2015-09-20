package com.fanhl.test.t2015.t09.t20150920

def swap(int a, int b) {

}

a = 23
b = 72

//方法1 
b^=a^=b
a^=b

//方法2//FIXME 这种写法过不去!!?为什么呢?
a^=b^=a^=b

println a
println b