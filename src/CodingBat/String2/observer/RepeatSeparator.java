package CodingBat.String2.observer;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(word);
            if(count-1 != i) {
                builder.append(sep);
            }
        }

        return builder.toString();
    }
}
