package Map;

import java.util.HashMap;
import java.util.Map;

public class MapAb {
    public Map<String, String> mapAB(Map<String, String> map) {
        // Check if both keys "a" and "b" are present
        if (map.containsKey("a") && map.containsKey("b")) {
            // Append the values of "a" and "b" and store under the key "ab"
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
