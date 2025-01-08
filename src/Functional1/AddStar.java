package Functional1;

import java.util.List;

public class AddStar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }
}
