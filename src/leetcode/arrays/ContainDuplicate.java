package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(checkDuplicate(nums));
    }

    public static boolean checkDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
