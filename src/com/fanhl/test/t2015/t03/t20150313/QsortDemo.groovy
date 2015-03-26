package com.fanhl.test.t2015.t03.t20150313

def qSort(List<Integer> lst) {
    lst.empty ? [] : (qSort(lst.grep { it < lst[0] }) + lst[0] + qSort(lst.grep { it > lst[0] }))
}

def lst = [1, 4, 2, 3, 23, 66, 7, 8]
println qSort(lst)
