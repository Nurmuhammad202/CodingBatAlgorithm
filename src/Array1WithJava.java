import java.util.Arrays;

public class Array1WithJava {

    public boolean firstLast6(int[] nums) {
        return ( nums[0] == 6 || nums[nums.length-1] == 6) ;
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && (nums[0] == nums[nums.length-1]));
    }

    public int[] makePi() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 4;

        return nums;
    }

    public String withoutX2(String str) {
        if(str.length() < 2) return  "";

        boolean isFirstX = str.charAt(0) == 'x';
        boolean isSecondX = str.charAt(1) == 'x';

        if(isFirstX && isSecondX) {
            return str.substring(2);
        }else if(isFirstX) {
            return str.substring(1);
        } else if (isSecondX) {
            return str.charAt(0) + str.substring(2);
        } else {
            return str;
        }
    }

    public int sum3(int[] nums) {
        int sum = 0;
        return Arrays.stream(nums).sum();
    }
}
