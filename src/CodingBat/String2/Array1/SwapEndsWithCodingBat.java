package CodingBat.String2.Array1;

public class SwapEndsWithCodingBat {

    public int[] swapEnds(int[] nums) {

        int firsElement = nums[0];
        int lastElement = nums[nums.length-1];

        nums[0] = lastElement;
        nums[nums.length-1] = firsElement;

        return nums;
    }
}
