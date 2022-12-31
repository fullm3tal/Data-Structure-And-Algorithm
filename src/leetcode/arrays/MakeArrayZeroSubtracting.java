package leetcode.arrays;

import java.util.HashSet;

public class MakeArrayZeroSubtracting {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 0, 3, 5};
        System.out.println(minimumOperations4(arr));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        int smallest = getSmallest(nums);
        while (smallest > 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] - smallest;
            }
            count++;
            smallest = getSmallest(nums);
        }
        return count;
    }

    private static int getSmallest(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        if (smallest == Integer.MAX_VALUE) {
            return -1;
        }
        return smallest;
    }

    public static int minimumOperations3(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                set.add(nums[i]);
            }
        }
        return set.size();
    }

    public static int minimumOperations4(int[] nums) {
       boolean []arr = new boolean[101];
       int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(!arr[nums[i]]&& nums[i] != 0) {
                count++;
            }
            arr[nums[i]] = true;
        }
        return count;
    }

}
