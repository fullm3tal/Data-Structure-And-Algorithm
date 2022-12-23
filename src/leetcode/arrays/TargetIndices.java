package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class TargetIndices {

    public static void main(String[] args) {
        int []nums = new int[]{1,2,5,2,3};
        System.out.println(targetIndices2(nums, 2));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        insertionSort(nums);
        for ( int i = 0;i< nums.length;i++) {
            if(target == nums[i]) {
                list.add(i);
            }
        }
        return list;
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i< nums.length; i++) {
            int current = nums[i];
            int j = i -1;
            while (j >=0 && current < nums[j]) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
    }

    public static List<Integer> targetIndices2(int[] nums, int target) {
        int lessCount = 0;
        int match = 0;
        for(int num: nums) {
            if(num == target ) {
                ++match;
            } else if(num < target) {
                ++lessCount;
            }
        }
        if(match == 0) {
            return List.of();
        }
        List<Integer> result = new ArrayList<>();
        while(match-- > 0) {
            result.add(lessCount++);
        }
        return result;
    }

}
