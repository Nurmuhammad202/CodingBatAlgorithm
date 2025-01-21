package CodingBat.String2.Functional1;

import java.util.List;

public class RightDigt {
    public List<Integer> rightDigit(List<Integer> nums) {

        nums.replaceAll(it -> it % 10);

        return nums;
    }
}
