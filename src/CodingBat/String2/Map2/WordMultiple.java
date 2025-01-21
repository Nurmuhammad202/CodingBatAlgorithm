package CodingBat.String2.Map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {

        HashMap<String, Boolean> map = new HashMap<>();

        for (String item: strings) {
            if(map.containsKey(item)) {
                map.put(item, true);
            } else {
                map.put(item, false);
            }
        }

        return map;

    }
}
