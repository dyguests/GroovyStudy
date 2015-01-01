def pickEven(n, block) {
    for (i in 2..n) {
        block(i)
    }
}

pickEven(10,{println it})