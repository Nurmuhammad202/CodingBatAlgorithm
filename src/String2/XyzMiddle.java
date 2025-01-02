package String2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        int middlePosition = str.indexOf('y');
        return str.length()/middlePosition == 2;
    }
}
