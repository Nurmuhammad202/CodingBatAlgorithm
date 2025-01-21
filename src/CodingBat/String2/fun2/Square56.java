package CodingBat.String2.fun2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(it -> (it * it) + 10)
                .filter(num -> num % 10 != 6 && num % 10 != 5)
                .collect(Collectors.toList());
    }
}
