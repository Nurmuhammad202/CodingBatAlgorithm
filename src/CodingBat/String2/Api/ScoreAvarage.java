package CodingBat.String2.Api;

public class ScoreAvarage {
    public int scoresAverage(int[] scores) {

       int resultPart1 = 0;
       int resultPart2 = 0;

        for (int i = 0; i < scores.length; i++) {
            if(i <= scores.length/2) {
                resultPart1 += scores[i];
            } else {
                resultPart2 += scores[i];
            }
        }

        int finalPart1 = resultPart1/(scores.length/2);
        int finalPart2 = resultPart2/(scores.length/2);

        return Math.max(finalPart1,finalPart2);
    }


}
