package com.fanhl.test.t2015.t02.t20150215

import groovy.xml.MarkupBuilder

def builder = new MarkupBuilder()
builder.gradeFather {
    father(name: "张三") { son('王五') }
    mother(id: "李四") {
        dauguther(cost: '200元') {
            heart('200')
        }
    }
}