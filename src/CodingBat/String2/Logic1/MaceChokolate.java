package CodingBat.String2.Logic1;

public class MaceChokolate {
    public int makeChocolate(int small, int big, int goal) {
        // Use as many big bars as possible without exceeding the goal
        int maxBigBars = goal / 5;
        int bigBarsUsed = Math.min(maxBigBars, big);

        // Calculate the remaining weight to fulfill with small bars
        int remainingWeight = goal - (bigBarsUsed * 5);

        // Check if there are enough small bars to meet the remaining weight
        if (remainingWeight <= small) {
            return remainingWeight; // Return the number of small bars needed
        } else {
            return -1; // Return -1 if it's not possible
        }
    }
}
