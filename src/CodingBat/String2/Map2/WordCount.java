package CodingBat.String2.Map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String item : strings) {
            if (map.containsKey(item)) {
                int counter = map.get(item);
                counter++;
                map.put(item, counter);
            } else {
                map.put(item, 1);
            }
        }

        return map;
    }
}
