package Map;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        // Check if the key "a" exists and has a value
        if (map.containsKey("a") && map.get("a") != null && !map.get("a").isEmpty()) {
            // Set the value of key "b" to the value of key "a"
            map.put("b", map.get("a"));
            // Set the value of key "a" to an empty string
            map.put("a", "");
        }
        return map;
    }
}
