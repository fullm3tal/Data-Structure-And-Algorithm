package leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {

    public static void main(String[] args) {
//        int[] arr = new int[]{2, 2, 3, 1};
        int[] arr = new int[]{1, 1, 1};
        System.out.println(thirdMax2(arr));
    }

//    public static int thirdMax(int[] nums) {
//        int distinctMax1 = nums[0];
//        int distinctMax2 = nums[0];
//        int distinctMax3 = nums[0];
//        int count = 0;
//        int max = -1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > distinctMax1 && nums[i] != distinctMax1 && nums[i] != distinctMax2 && nums[i] != distinctMax3 ) {
//                distinctMax3 = distinctMax2;
//                distinctMax2 = distinctMax1;
//                distinctMax1 = nums[i];
//                count++;
//            }
//        }
//        return distinctMax3;
//    }

    public static int thirdMax2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] arr = new int[set.size()];
        int index = 0;
        for (int i : set) {
            arr[index] = i;
            index++;
        }
        DeleteGreatest.insertionSort(arr);
        if (arr.length <= 2) {
            return arr[0];
        }
        return arr[2];
    }
}
