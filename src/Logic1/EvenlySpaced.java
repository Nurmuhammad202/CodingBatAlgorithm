package Logic1;

import java.util.Arrays;

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        int[] list = new int[3];
        list[0] = a;
        list[1] = b;
        list[2] = c;

        Arrays.stream(list).sorted();

        for (int j : list) {
            System.out.println(j);
        }
        return true;
    }

    public static void main(String[] args) {
        evenlySpaced(1,5,3);
    }

}
