package CodingBat.String2.observer;

public class CodeCount {
    public int countCode(String str) {
        char[] list = str.toCharArray();

        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (i + 4 <= list.length) {
                if (list[i] == 'c' && list[i + 1] == 'o' && list[i + 3] == 'e') {
                  counter++;
                }
            }
        }

        return counter;
    }
}
