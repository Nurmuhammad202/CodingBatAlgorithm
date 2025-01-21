package CodingBat.String2.observer;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
      String item = str.substring(str.length()-n);
      StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            builder.append(item);
        }

        return builder.toString();
    }
}
