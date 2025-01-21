package CodingBat.String2.Logic1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
      if(bOk) {
          return (b < c);
      } else {
          return (a < b && b < c);
      }
    }
}
