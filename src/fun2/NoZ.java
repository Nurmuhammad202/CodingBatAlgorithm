package fun2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public static List<String> noZ(List<String> strings) {

        strings.removeIf(item -> item.contains("z"));

        return strings;
    }
}
