package Logic1;

public class More20 {
    public static boolean more20(int n) {
        return ((n-1) % 20 == 0 || (n-2 ) % 20 == 0);
    }

    public static void main(String[] args) {
        System.out.println(more20(21));
        System.out.println(more20(22));
        System.out.println(more20(20));
    }

}
