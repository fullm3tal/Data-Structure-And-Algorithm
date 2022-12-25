package leetcode.arrays;

import java.util.Arrays;

public class ArithmeticTriplet {

    public static void main(String[] args) {
        int[] nums = new int[]{2,4,6,8,9 };
        System.out.println(arithmeticTriplets2(nums, 5));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static int arithmeticTriplets2(int[] nums, int diff) {
        int[] arr = new int[1001];
        int count = 0;
        Arrays.fill(arr, -1);
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = nums[i];
        }
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] >= 0 && arr[k] >= 0 && arr[k] - arr[j] == diff && arr[k + diff]  > 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
