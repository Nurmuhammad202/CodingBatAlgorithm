package Logic1;

public class NearTen {
    public boolean nearTen(int num) {
        int remainder = num % 10;
        return remainder <= 2 || remainder >= 8;
    }
}
