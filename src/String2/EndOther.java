package String2;

public class EndOther {
    public boolean endOther(String a, String b) {

        // Convert both strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if one string ends with the other
        return a.endsWith(b) || b.endsWith(a);
    }
}
