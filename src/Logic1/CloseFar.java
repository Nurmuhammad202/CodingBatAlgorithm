package Logic1;

public class CloseFar {
    public static boolean closeFar(int a, int b, int c) {
        if(Math.abs(a - b) <= 1 && !(Math.abs(a-c) == 1) && Math.abs(b-c) > 1) {
            return true;
        } else if(Math.abs(a - c) <= 1 && !(Math.abs(a-b) == 1) && Math.abs(b-c) > 1) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        closeFar(-1, 10, 0);
    }
}


