package Functional1;

import java.util.List;

public class Nox {
    public List<String> noX(List<String> strings) {

        strings.replaceAll(it -> it.replace("x",""));

        return strings;
    }
}
