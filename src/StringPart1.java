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

    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    public String lastTwo(String str) {
        if(str.length() < 2) return str;

        return str.substring(0, str.length() - 2) +
                str.substring(str.length() - 1) +
                str.charAt(str.length() - 2);
    }

    public String conCat(String a, String b) {

        if(a.isEmpty()) return b;
        if(b.isEmpty()) return a;

        if(a.substring(a.length()-1).equals(b.substring(0,1))) {
            return a.substring(0, a.length()-1) + b;
        } else {
            return a + b;
        }

    }

    public String atFirst(String str) {
        if(str.isEmpty()) return "@@";
        if(str.length() == 1) return str + "@";

        return str.substring(0,2);
    }

    public String middleThree(String str) {
        if(str.length() <=3 ) return str;

        else return str.substring((str.length()/2)-1, (str.length()/2)+2);
    }

    public boolean endsLy(String str) {
        if(str.length() < 2) return false;

        return str.endsWith("ly");
    }

    public String middleTwo(String str) {
        return str.substring(str.length()/2 -1,str.length()/2+1);
    }

    public String deFront(String str) {
        if(str.length() < 2) return str;

        char first = str.charAt(0);
        char second = str.charAt(1);

        StringBuilder builder = new StringBuilder();
        if (first == 'a') builder.append(first);
        if (second == 'b') builder.append(second);
        builder.append(str.substring(2));

        return builder.toString();
    }

    public String withouEnd2(String str) {
        if(str.length() <=2) return "";

        return str.substring(1,str.length()-1);
    }

    public String theEnd(String str, boolean front) {
        if(front) {
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1);
        }
    }

    public String helloName(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(" ");
        builder.append(name);
        builder.append("!");
        return builder.toString();
    }

    public String makeTags(String tag, String word) {
        String start = "<";
        String end = ">";

        return start + tag + end + word + start + "/" +tag +end;
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    public String withoutX(String str) {
        if(str.isEmpty()) return str;

        String newWord = str;
        if(str.startsWith("x")){
            newWord =  newWord.substring(1);
        }

        if(str.endsWith("x")) {
            newWord = newWord.substring(str.length() - 1);
        }
        return newWord;
    }

}
