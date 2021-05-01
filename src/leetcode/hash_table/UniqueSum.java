package leetcode.hash_table;

import java.util.HashMap;
import java.util.Map;

public class UniqueSum {

    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], true);
            } else {
                map.put(nums[i], false);
            }
        }
        for (Map.Entry<Integer, Boolean> m : map.entrySet()) {
            if (m.getValue().equals(false)) {
                sum += m.getKey();
            }
        }
        return sum;
    }

    public static int sumOfUnique2(int[] nums) {
        int sum = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (!map.get(nums[i])) {
                    sum = sum - nums[i];
                    map.replace(nums[i], true);
                }
            } else {
                sum += nums[i];
                map.put(nums[i], false);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr = {10,6,9,6,9,6,8,7};
        System.out.println(sumOfUnique2(arr));
    }

}
