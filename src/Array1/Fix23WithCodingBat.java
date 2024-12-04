package Array1;

public class Fix23WithCodingBat {
    public int[] fix23(int[] nums) {
        for(int i = 0; i<nums.length-1; i++) {
            if(i+1 <= nums.length -1) {
                if (nums[i] == 2 && nums[i + 1] == 3) {
                    nums[i + 1] = 0;
                }
            }
        }

        return nums;
    }
}
