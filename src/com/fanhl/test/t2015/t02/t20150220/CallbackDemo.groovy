package com.fanhl.test.t2015.t02.t20150220

class DemoA {
    def main() {
        def b = methodA()
        methodB(b)
    }

    def methodA() { 1 }

    def methodB(int i) { println i }
}

class DemoB {
    def main() {
        methodA(methodB)
    }

    def methodA(Closure closure) {
        closure(2)
    }

    def methodB = { println it }
}

//无回调
new DemoA().main()
//回调
new DemoB().main()