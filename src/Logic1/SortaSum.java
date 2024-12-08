package Logic1;

public class SortaSum {
    public int sortaSum(int a, int b) {
        int sum = a + b;

        if(sum>=10 && sum < 20) {
            return 20;
        } else {
            return sum;
        }
    }

}
