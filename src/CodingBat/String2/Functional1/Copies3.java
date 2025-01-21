package CodingBat.String2.Functional1;

import java.util.List;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(item -> item + item + item);

        return strings;
    }
}
