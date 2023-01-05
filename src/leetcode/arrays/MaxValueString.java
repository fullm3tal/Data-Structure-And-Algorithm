package leetcode.arrays;


import java.util.HashSet;
import java.util.Set;

public class MaxValueString {

    public static void main(String[] args) {
        String[] nums = new String[]{"3glko", "1"};
        System.out.println(maximumValue(nums));
    }

    public static int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].matches("-?\\d+")) {
                int num = Integer.parseInt(strs[i]);
                if (num > max) {
                    max = num;
                }
            } else {
                int len = strs[i].length();
                if (len > max) {
                    max = len;
                }
            }
        }
        return max;
    }

}
