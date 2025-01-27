package CodingBat.String2.Api;

public class Score100 {
    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            // Проверяем, стоят ли два подряд 100
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        // Если пара 100 подряд не найдена
        return false;
    }
}
