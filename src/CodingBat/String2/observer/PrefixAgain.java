package CodingBat.String2.observer;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
      String item = str.substring(0,n);

      String partFromStr = str.substring(n);
      return partFromStr.contains(item);
    }
}
