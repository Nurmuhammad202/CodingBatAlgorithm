package Logic1;

public class RoundingCalculator {
    public static int roundSum(int a, int b, int c) {
        // Call round10 for each value and return their sum
        return round10(a) + round10(b) + round10(c);
    }

    // Helper method to round a number to the nearest multiple of 10
    public static int round10(int num) {
        if (num % 10 >= 5) {
            // Round up to the next multiple of 10
            return ((num / 10) + 1) * 10;
        } else {
            // Round down to the previous multiple of 10
            return (num / 10) * 10;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(roundSum(16, 17, 18)); // Output: 60
        System.out.println(roundSum(12, 13, 14)); // Output: 30
        System.out.println(roundSum(6, 4, 4));    // Output: 10
    }
}
