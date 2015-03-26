package com.fanhl.test.t2015.t02.t20150226

import java.util.concurrent.*

CUTOFF = 12    // not worth parallelizing for small n
THREADS = 100

println "Calculating Fibonacci sequence in parallel..."
serialFib = { n -> (n < 2) ? n : serialFib(n - 1) + serialFib(n - 2) }
pool = Executors.newFixedThreadPool(THREADS)
defer = { c -> pool.submit(c as Callable) }
fib = { n ->
    if (n < CUTOFF) return serialFib(n)
    def left = defer { fib(n - 1) }
    def right = defer { fib(n - 2) }
    left.get() + right.get()
}

(8..16).each { n -> println "n=$n => ${fib(n)}" }
pool.shutdown()