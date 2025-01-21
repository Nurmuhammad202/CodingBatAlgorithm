package CodingBat.String2.Api;

public class Score {
    public boolean scoresIncreasing(int[] scores) {

        boolean isScores = true;
        for (int i = 0; i < scores.length; i++) {
            if((i+1) < scores.length) {
                if(scores[i] > scores[i+1]) {
                    isScores = false;
                    break;
                }
            }
        }

        return isScores;
    }
}
