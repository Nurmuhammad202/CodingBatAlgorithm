package Map2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        HashMap<Character, Integer> map = new HashMap<>(); // Map to store first character and index
        Set<Character> swapped = new HashSet<>(); // Set to track characters that have caused a swap

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0); // Get the first character of the current string

            // Check if the character has already caused a swap
            if (swapped.contains(firstChar)) {
                continue;
            }

            if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar); // Get the earlier index

                // Swap the strings at the current index and the earlier index
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                // Mark the character as having caused a swap
                swapped.add(firstChar);

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
