def iter(n, clos) {
    1.upto(n){
        println "in $it"
        clos(it)
    }
}

total=0
iter(4){
    total+=it
    println "out $total"
}
