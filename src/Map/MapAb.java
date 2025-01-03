package Map;

import java.util.HashMap;
import java.util.Map;

public class MapAb {
    public Map<String, String> mapAB(Map<String, String> map) {
        // Check if the key "a" exists and has a value
        Map<String, String> newMap = new HashMap<>();
        if (map.containsKey("a") && map.containsKey("b")) {

            newMap.put("a", map.get("a"));
            newMap.put("ab", map.get("a") + map.get("b"));
            newMap.put("b", map.get("b"));
            return map;
        } else {
            return map;
        }
    }
}
