package Map;

import java.util.Map;

public class MapAb4 {
    public Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            }

            if(map.get("a").length() < map.get("b").length()) {
                map.put("c", map.get("b"));
            }

            if(map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            }

        }
        return map;
    }
}
