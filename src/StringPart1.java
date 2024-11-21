public class StringPart1 {

    public String extraFront(String str) {
        if (str.length() < 2) return str + str + str;

        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    public String without2(String str) {

        if (str.length() <= 1) return str;

        if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return str.substring(2);
        else
            return str;
    }

}
