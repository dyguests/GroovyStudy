package com.fanhl.test.t2015.t01.t20150107
//验证声明数组时是否需要声明每个元素的实例
String[] strings = new String[3]
//println strings.collect { it += "end" }
//println strings.collect { it ? (it = 'end') : (it += 'end') }
//println strings.collect { it }
//println strings.collect { it.toUpperCase() }

//结论,不会产生实例


strings.each { it='demo' }
println strings.collect{it}