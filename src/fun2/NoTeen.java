package fun2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num < 13 || num > 19)
                .collect(Collectors.toList());
    }
}
