package CodingBat.String2.Functional1;

import java.util.List;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {

        nums.replaceAll(integer -> integer * 2);

        return nums;
    }
}
