package CodingBat.String2.fun2;

import java.util.List;
import java.util.stream.Collectors;

public class NoY {
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(item -> item + "y")
                .filter(it -> !it.contains("yy"))
                .collect(Collectors.toList());
    }
}
