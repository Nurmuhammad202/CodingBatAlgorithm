package Array1;

public class MakeMiddleWithCodingBat {

    public int[] makeMiddle(int[] nums) {
        int length = nums.length;
        if(length <= 2) return nums;

        return new int[] { nums[(length/2) -1], nums[(length/2)] };
    }
}
