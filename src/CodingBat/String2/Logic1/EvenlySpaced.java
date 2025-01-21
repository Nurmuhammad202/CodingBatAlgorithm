package CodingBat.String2.Logic1;

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        if (a == b && a == c) return true;
        if (a == b || b == c || a == c) return false;

        if (Math.abs(a - b) == Math.abs(b - c)) {
            return true;
        } else if (Math.abs(b - a) == Math.abs(a - c)) {
            return true;
        } else if (Math.abs(c - a) == Math.abs(b - c)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        evenlySpaced(1, 5, 3);
        evenlySpaced(4, 6, 2);
        evenlySpaced(2, 2, 3);
        evenlySpaced(6, 2, 4);
        evenlySpaced(2, 4, 4);

    }

}
