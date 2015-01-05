import static java.lang.Math.random as rand

enum CoffeeSize {
    S, M, L, U
}

def orderCoffee(size) {
    println "Coffee size $size"
    switch (size) {
        case [CoffeeSize.S, CoffeeSize.M]:
            println "SSSSMMMMMM"
            break
        case CoffeeSize.L:
            println "LLLLL"
            break
        case CoffeeSize.U:
            println "UUUUUU"
            break
    }
}

orderCoffee(CoffeeSize.S)

println rand()
println rand()
println rand()
println rand()