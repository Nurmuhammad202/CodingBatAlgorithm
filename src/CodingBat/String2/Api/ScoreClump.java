package CodingBat.String2.Api;

import java.util.Map;

public class ScoreClump {
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            // Проверяем разницу между минимальным и максимальным из трех подряд идущих элементов
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        // Если не нашли подходящей тройки, возвращаем false
        return false;
    }
}
