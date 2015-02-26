package com.fanhl.test.t2015.t02.t20150226

int 一段执行10秒的方法() { loop(10); 2 }

int 一段执行15秒的方法() { loop(15); 3 }

def loop(int times) {
    times.times {
        Thread.sleep(1000)
        println "loop $it"
    }
}

def threads = []
def results = []
threads << Thread.start { results << 一段执行10秒的方法() }
threads << Thread.start { results << 一段执行15秒的方法() }

threads*.join()
println results.sum()