package Map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        HashMap<String, String> map = new HashMap<>();

        for (String string : strings) {
            map.put(string.substring(0, 1), string.substring(string.length() - 1));
        }

        return map;
    }
}
