package Array1;

public class MakeLastFromCodingBat {

    public static int[] makeLast(int[] nums) {
        int[] newList = new int[nums.length*2];
        int lastElement = nums[nums.length-1];

        for (int i = 0; i <= newList.length - 1; i++) {
            if (i == newList.length - 1) {
                newList[i] = lastElement;
            } else {
                newList[i] = 0;
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        int[] list = new int[2];
        list[0] = 1;
        list[1] = 1;
        makeLast(list);
    }
}
