package Map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>(); // Map to store first character and index

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0); // Get the first character of the current string

            if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar); // Get the earlier index

                // Swap the strings at the current index and the earlier index
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                // Remove the character from the map after the swap
                map.remove(firstChar);
            } else {
                // Store the current character and its index in the map
                map.put(firstChar, i);
            }
        }

        return strings;
    }
}
