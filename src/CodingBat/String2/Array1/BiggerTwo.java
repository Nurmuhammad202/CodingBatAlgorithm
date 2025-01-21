package CodingBat.String2.Array1;

import java.util.Arrays;

public class BiggerTwo {

    public int[] biggerTwo(int[] a, int[] b) {
      int resultA =  Arrays.stream(a).sum();
      int resultB =  Arrays.stream(b).sum();

      if(resultA>resultB) {
          return a;
      } else {
          return b;
      }

    }
}
