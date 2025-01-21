package CodingBat.String2.Map2;


import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {

        Map<String, Integer> map = new HashMap<>(); // CodingBat.String2.Map to count occurrences of strings
        StringBuilder result = new StringBuilder(); // StringBuilder to build the result

        for (String str : strings) {
            map.put(str, map.getOrDefault(str, 0) + 1); // Increment count for the string

            // Append to result if the count is even
            if (map.get(str) % 2 == 0) {
                result.append(str);
            }
        }

        //

        return result.toString();
    }
}
