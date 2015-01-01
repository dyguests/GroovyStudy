def tell(closure) {
    tellFrom = closure.curry(5)
    tellFrom 6
    tellFrom 7
    closure 1,2

    tellTo=closure.ncurry(1,8)//将第1个参数(一共有第0个参数,第1个参数,共2个参数)设成8
    tellTo 6
    tellTo 7
}

tell { a, b -> a.upto(b) { println it } }