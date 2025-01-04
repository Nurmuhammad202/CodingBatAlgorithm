package Map2;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map2 {
    public Map<String, Integer> word0(String[] strings) {

        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        for (String string : strings) {
            sortedMap.put(string, 0);
        }

        return sortedMap;
    }
}
