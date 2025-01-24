package CodingBat.String2.Map2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>(); // CodingBat.String2.Map to store first character and index

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

    public static void main(String[] args) {
        File file = new File("example.txt");
        FileReader reader = null; // IOException yuzaga kelishi mumkin
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(reader.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
