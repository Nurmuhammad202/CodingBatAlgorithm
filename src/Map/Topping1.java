package Map;

import java.util.Map;

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        // If the key "ice cream" is present, set its value to "cherry"
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        // Set the key "bread" to have the value "butter"
        map.put("bread", "butter");
        return map;
    }
}
