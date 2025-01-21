package CodingBat.String2.Logic1;

public class TeaParty {
    public int teaParty(int tea, int candy) {
      if(tea>=5 && candy>=5) {
          int min = Math.min(tea, candy);
          int max = Math.max(tea, candy);
          boolean isSuccess = max/min >= 2;
          if(isSuccess) {
              return 2;
          } else {
              return 1;
          }
      } else {
          return 0;
      }
    }
}
