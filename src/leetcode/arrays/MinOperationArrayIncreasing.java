package leetcode.arrays;

public class MinOperationArrayIncreasing {

    public static int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            while (nums[i] <= nums[i - 1]) {
                nums[i] += 1;
                count++;
            }
        }
        return count;
    }

    public static int minOperations2(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count += nums[i - 1] - nums[i] + 1;
                nums[i] +=  nums[i - 1] - nums[i] + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        System.out.println(minOperations2(arr));
    }

}

