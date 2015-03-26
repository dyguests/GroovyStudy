package com.fanhl.test.t2015.t03.t20150309

class AImpl{
    def print(){    println "2333"}
}

interface AInterface{
    def print()
}

AInterface a=new AImpl()
a.print()