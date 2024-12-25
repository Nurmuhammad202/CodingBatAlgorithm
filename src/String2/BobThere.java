package String2;

public class BobThere {
    public boolean bobThere(String str) {
        char[] list = str.toCharArray();

        for (int i = 0; i < list.length-2; i++) {
            if(list[i] == 'b' && list[i+2] == 'b') {
                return true;
            }
        }

        return false;
    }
}
