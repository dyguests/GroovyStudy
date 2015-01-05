for (ch in 'a'..'d') {
    println ch
}

for (ch = 'a'; ch < 'd'; ch++) {
    println ch
}

class ComplexNumber {
    def real, imaginary

    def plus(other) {
        new ComplexNumber(real: real + other.real, imaginary: imaginary + other.imaginary)
    }

    String toString() { "$real,$imaginary" }
}

c1 = new ComplexNumber(real: 1, imaginary: 100)
c2 = new ComplexNumber(real: 4, imaginary: 300)

println c1 + c2

class MyOperator{
    def i

    def plus(other){
        new MyOperator(i:i+other.i)
    }
}
