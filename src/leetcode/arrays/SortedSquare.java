package leetcode.arrays;

import java.util.Arrays;

public class SortedSquare {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        insertionSort(nums);
        return nums;
    }

    public int[] sortedSquares2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquares3(int[] nums) {
        int l = 0, r = nums.length - 1;
        int []arr = new int[nums.length];
        for (int i = r; i >=0; i--) {
            if(Math.abs(nums[l])> Math.abs(nums[r])) {
                arr[i] = nums[l]* nums[l];
                l++;
            } else {
                arr[i] = nums[r]* nums[r];
                r--;
            }
        }
        return arr;
    }


    private static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && current < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int []nums = new int[]{-4,-1,0,3,10};
        System.out.println(sortedSquares3(nums));
        System.out.println(Math.abs((-1)));
        System.out.println(Math.abs((1)));
    }

}
