package CodingBat.String2.observer;

public class XyBalance {
    public static boolean xyBalance(String str) {
        if(str.isEmpty()) return true;

        if(!str.contains("x")) return true;
        else {
            int index = str.lastIndexOf('x');
            String newItem = str.substring(index);
            return newItem.contains("y");
        }
    }

    public static void main(String[] args) {
        xyBalance("aaxbby");
    }
}

