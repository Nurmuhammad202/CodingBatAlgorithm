package String2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder builder = new StringBuilder();

        String item = str.substring(0,n);

        for (int i = item.length(); i > 0; i--) {
            builder.append(item.substring(0,i));
        }

        return builder.toString();
    }
}
