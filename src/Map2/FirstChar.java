package Map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {

        HashMap<String,String> map = new HashMap<>();

        for (String item: strings) {
            String firstElement = item.substring(0,1);

            if(map.containsKey(firstElement)) {
                String newItem = map.get(firstElement) + item;
                map.put(firstElement, newItem);
            } else {
                map.put(firstElement, item);
            }
        }

        return map;
    }
}
