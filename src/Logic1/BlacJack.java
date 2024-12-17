package Logic1;

public class BlacJack {
    public int blackjack(int a, int b) {
        if(a>21 && b>21) return 0;

        if(checkSmallFrom21(a) && checkSmallFrom21(b)) {
            return Math.max(a,b);
        } else if(checkSmallFrom21(a)) {
            return a;
        } else {
            return b;
        }
    }

    private boolean checkSmallFrom21(int number) {
        return number<=21;
    }
}
