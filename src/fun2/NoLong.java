package fun2;

import java.util.List;

public class NoLong {
    public static List<String> noLong(List<String> strings) {

        strings.removeIf(item -> item.length() >= 4);

        return strings;
    }
}
