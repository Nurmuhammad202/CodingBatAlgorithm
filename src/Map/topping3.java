package Map;

import java.util.Map;

public class topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        // If the key "salad" has a value, set that as the value for "spinach"
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;

    }
}
