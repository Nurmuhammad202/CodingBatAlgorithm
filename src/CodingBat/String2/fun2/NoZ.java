package CodingBat.String2.fun2;

import java.util.List;

public class NoZ {
    public static List<String> noZ(List<String> strings) {

        strings.removeIf(item -> item.contains("z"));

        return strings;
    }
}
