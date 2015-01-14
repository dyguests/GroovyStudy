package com.fanhl.test.t2015.t01.t20150111

class A {
   static enum Value {
        _2(2), _3(3), _4(4), _5(5), _6(6), _7(7), _8(8), _9(9), T(10), J(11), Q(12), K(13), A(14),
        /*BLACK_JOKER*/BJ(98),/*RED_JOKER*/ RJ(99)

        final int i

        def Value(int i) { this.i = i }

        /**
         * 除大小王之外的牌
         */
        static Value[] littleValues = [_2, _3, _4, _5, _6, _7, _8, _9, T, J, Q, K, A]

        int toInt() { i }

        @Override
        public String toString() {
            switch (this) {
                case _2: return "2"
                case _3: return "3"
                case _4: return "4"
                case _5: return "5"
                case _6: return "6"
                case _7: return "7"
                case _8: return "8"
                case _9: return "9"
                case T: return "T"
                case J: return "J"
                case Q: return "Q"
                case K: return "K"
                case A: return "A"
                case BJ: return "BJ"
                case RJ: return "RJ"
                default:/*此分支不会出现*/ return "N"
            }
        }
    }
}

A.Value.littleValues.each { println it }