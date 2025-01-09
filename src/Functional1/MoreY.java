package Functional1;

import java.util.List;

public class MoreY {
    public List<String> moreY(List<String> strings) {
       strings.replaceAll(item -> "y" + item + "y");

       return strings;
    }
}
