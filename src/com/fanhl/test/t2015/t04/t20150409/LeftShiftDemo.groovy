package com.fanhl.test.t2015.t04.t20150409

String leftShift(String str, int n = 1) {
    def length = str.length()
    def result = new char[length]
    for (int i = 0; i < length; i++) {
        result[i] = str[(i + n) % length]
    }
    result.toString()
}


println leftShift("This is what!")
println leftShift("This is what!",5)
