package CodingBat.String2.observer;

public class CountHI {
    public int countHi(String str) {

        if(str.length() <= 1) return 0;
        char[] list = str.toCharArray();

        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if ((i + 1) <= list.length) {
                if(list[i] =='h' && list[i+1] == 'i') {
                    counter++;
                }
            }
        }

        return counter;
    }
}
