package com.fanhl.test.t2015.t02.t20150208

def com = 0b11
def a = 1

println com
println a
println "与: ${a & com}"
println "或: ${a | com}"
println "异或: ${a ^ com}"
println 0
println ~0
println 1
println ~1

int i=1
i^=1
println i
i^=1
println i
