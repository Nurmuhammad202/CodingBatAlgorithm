package String2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String item = str.substring(0, n);
        StringBuilder builder = new StringBuilder();

        builder.append(item);
        builder.append(item);

        return builder.toString();
    }

    private String item() {
        return "e32";
    }
}
