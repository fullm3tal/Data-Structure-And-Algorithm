package leetcode.arrays;

public class MaxCount {

    public static int maximumCount(int[] nums) {
        int neg = 0;
        int zero = 0;
        for (int num : nums) {
            if (num > 0) {
                break;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        return Math.max(nums.length - (neg + zero), neg);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-3, -2, -1, 0, 0, 1, 2};
        System.out.println(maximumCount(arr));
    }

}
