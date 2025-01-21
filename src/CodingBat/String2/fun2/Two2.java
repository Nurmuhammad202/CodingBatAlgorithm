package CodingBat.String2.fun2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .map(it -> it * 2)
                .filter(num -> num % 10 != 2)
                .collect(Collectors.toList());
    }
}
