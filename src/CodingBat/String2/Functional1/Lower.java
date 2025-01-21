package CodingBat.String2.Functional1;

import java.util.List;

public class Lower {
    public List<String> lower(List<String> strings) {

        strings.replaceAll(String::toLowerCase);

        return strings;
    }
}
