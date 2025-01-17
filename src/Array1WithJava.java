import java.util.ArrayList;
import java.util.Arrays;

public class Array1WithJava {

    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && (nums[0] == nums[nums.length - 1]));
    }

    public int[] makePi() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 4;

        StringBuilder builder = new StringBuilder();

        return nums;
    }

    public String withoutX2(String str) {
        if (str.length() < 2) return "";

        boolean isFirstX = str.charAt(0) == 'x';
        boolean isSecondX = str.charAt(1) == 'x';

        if (isFirstX && isSecondX) {
            return str.substring(2);
        } else if (isFirstX) {
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

    public int[] rotateLeft3(int[] nums) {

        return new int[] { nums[1], nums[2], nums[0] };
    }

    public String withoutX(String str) {
        if (str.isEmpty()) return str;

        boolean isFirstX = str.startsWith("x");
        boolean isSecondX = str.endsWith("x");
        if (isFirstX && isSecondX) {
            return str.substring(1, str.length() - 1);
        } else if (isFirstX) {
            return str.substring(1);
        } else if (isSecondX) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        // Extract the substring of `str` of the same length as `word`
        String strPart = str.substring(0, word.length());

        // Check if the substring matches the word, ignoring the first character
        if (strPart.substring(1).equals(word.substring(1))) {
            return strPart;
        }

        return ""; // No match
    }

    public int[] makeEnds(int[] nums) {
        if(nums.length <2) return new int[] { nums[0] };

        return new int[] { nums[0] , nums[nums.length-1] };
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3 );
    }


}
