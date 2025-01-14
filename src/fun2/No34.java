package fun2;

import java.util.List;

public class No34 {
    public List<String> no34(List<String> strings) {
        strings.removeIf(item -> item.length() == 3 || item.length() == 4);

        return strings;
    }
}
