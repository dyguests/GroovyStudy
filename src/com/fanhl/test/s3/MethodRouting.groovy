class Handler {
    def f1() { println "f1 called from Handler" }

    def f2() { println "f2 called from Handler" }
}

class Example {
    def f1() { println "f1 called from Example" }

    def f2() { println "f2 called from Example" }

    def foo(closure) {
        closure.delegate = new Handler()//这里有点复杂
        closure()
    }
}

def f1() { println "f1 called from script" }

new Example().foo {
    f1()
    f2()
}