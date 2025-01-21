package CodingBat.String2.observer;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();

        // Get the lengths of the two strings
        int minLength = Math.min(a.length(), b.length());

        // Iterate through the characters of both strings up to the length of the shorter string
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)); // Add character from string 'a'
            result.append(b.charAt(i)); // Add character from string 'b'
        }

        // Append the remaining characters of the longer string
        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        } else if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }
}
