package Logic1;

public class BrickBuilder {
    public static boolean makeBricks(int small, int big, int goal) {
        // Calculate the maximum contribution of big bricks (in 5-inch increments)
        int maxBigBricks = Math.min(goal / 5, big);

        // Calculate the remaining inches after using big bricks
        int remainingInches = goal - (maxBigBricks * 5);

        // Check if the remaining inches can be fulfilled with small bricks
        return remainingInches <= small;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(makeBricks(3, 1, 8)); // Output: true
        System.out.println(makeBricks(3, 1, 9)); // Output: false
        System.out.println(makeBricks(3, 2, 10)); // Output: true
    }
}

