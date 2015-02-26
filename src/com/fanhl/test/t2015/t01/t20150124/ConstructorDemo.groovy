package com.fanhl.test.t2015.t01.t20150124

class T {
    int a, b

    def T(int a = 0, b = 1) {
        this.a = a
        this.b = b
    }

    @Override
    String toString() {
        "$a $b"
    }
}

println new T()
println new T(1)
println new T(1,2)
