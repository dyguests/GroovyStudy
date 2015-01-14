class FinalG {

    final Suit i

    public FinalG() {
    }

    private FinalG(Suit i2) {
        i = i2
    }

    @Override
    String toString() {
        i
    }

    static enum Suit {
        /*梅花,三叶草*/ clubs(1),
        /*方块, 红方, 钻石*/diamonds(2),
        /*红桃,红心*/hearts(3),
        /*黑桃, 剑*/spades(4)

        final int i

        private Suit(int i) {
            this.i = i
        }

        @Override
        String toString() {
            switch (this) {
                case clubs: return "C"
                case diamonds: return "D"
                case hearts: return "H"
                case spades: return "S"
                default:/*此分支不会出现*/ return "N"
            }
        }
    }
}

def g = new FinalG(FinalG.Suit.clubs)
println g
//final生效了
//g.i=FinalG.Suit.diamonds
//println g
println new FinalG()