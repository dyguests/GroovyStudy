package com.fanhl.test.t2015.t01.t20150116

int sum(int... someInts) {
    def total = 0
    for (int i = 0; i < someInts.size(); i++)
        total += someInts[i]
    return total
}

assert sum(1,2,3)==6

//println [1,2,3].sum()