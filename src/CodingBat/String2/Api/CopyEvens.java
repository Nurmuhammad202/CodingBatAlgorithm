package CodingBat.String2.Api;

import java.util.ArrayList;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count]; // Новый массив длиной count
        int index = 0; // Индекс для записи в result

        for (int num : nums) {
            if (num % 2 == 0) { // Проверяем, четное ли число
                result[index] = num;
                index++;
                if (index == count) break; // Если набрали count чисел — выходим
            }
        }

        return result;
    }

}
