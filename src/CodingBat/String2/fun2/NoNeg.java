package CodingBat.String2.fun2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num >= 0)
                .collect(Collectors.toList());
    }
}
