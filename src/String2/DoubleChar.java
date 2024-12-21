package String2;

public class DoubleChar {
    public String doubleChar(String str) {
        char[] list = str.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
             builder.append(list[i]);
             builder.append(list[i]);
        }

        return builder.toString();
    }
}
