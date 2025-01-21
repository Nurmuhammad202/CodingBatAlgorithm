package CodingBat.String2.observer;

public class XyzThere {
    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            // Check if "xyz" is found and not preceded by '.'
            if (str.substring(i, i + 3).equals("xyz") &&
                    (i == 0 || str.charAt(i - 1) != '.')) {
                return true;
            }
        }
        return false;
    }
}
