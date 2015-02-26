package com.fanhl.test.t2015.t01.t20150129

import groovy.transform.ToString

@ToString
class MInt {
    int i
}

GroovyConvert.from(Integer).to(MInt).using { new MInt(i: value) }
def m = 2 as MInt
println m


@ToString
class NInt {
    int i, j

    def NInt(int i = 0, int j = 0) {
        this.i = i
        this.j = j
    }
}

GroovyConvert.from(Integer).to(NInt).using { new NInt(value) }
def n = 2 as NInt
println n


@ToString
class OInt {
    int i
}

GroovyConvert.from(Integer).to(OInt).using { new OInt(i: value) }
def o = 2 as OInt
println o

int r=5
def s=r as MInt
println s