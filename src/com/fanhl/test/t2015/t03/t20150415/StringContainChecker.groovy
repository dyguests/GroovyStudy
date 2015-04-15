package com.fanhl.test.t2015.t03.t20150415
//时间为O(m+n),空间上只用了一个int变量(若要分大小写就用long变量就行)
//97 == 'a'
def contain(String father, String son) {
    int b = 0
    for (char c : son) b |= 1 << (c - 97)
    for (char c : father) b &= ~(1 << (c - 97))
    !b
}

println contain("father", "fffaaaffafa")
println contain("father", "fffaaabbbcc")