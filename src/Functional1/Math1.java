package Functional1;

import java.util.List;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(item -> (item+1) * 10);

        return nums;
    }
}
