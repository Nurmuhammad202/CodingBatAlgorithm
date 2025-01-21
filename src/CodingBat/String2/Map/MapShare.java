package CodingBat.String2.Map;

import java.util.Map;

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        // Check if the key "a" exists and has a value
        if (map.containsKey("a") && map.get("a") != null && !map.get("a").isEmpty()) {
            // Set the value of key "b" to the value of key "a"
            map.put("b", map.get("a"));
        }

        if(map.containsKey("c")) {
            map.remove("c");
        }

        StringBuilder builder = new StringBuilder();

        return map;
    }
}
