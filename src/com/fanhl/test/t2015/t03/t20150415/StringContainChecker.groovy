package com.fanhl.test.t2015.t03.t20150415
//时间为O(m+n),空间上只用了一个int变量(若要分大小写就用long变量就行)
def contain(String father, String son) {
    int checker = 0
    for (char c : son) checker |= 1 << (c - 97)//根据son对checker对应位1
    for (char c : father) checker &= ~(1 << (c - 97))//根据father对checker对应位置0
    !checker//checker为0时表示完全包含
}

println contain("father", "fffaaaffafa")
println contain("father", "fffaaabbbcc")
println contain("father", "fat")
println contain("father", "xyz")

/*以下为输出结果
true
false
true
false

Process finished with exit code 0
*/
