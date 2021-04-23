package leetcode.arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] array = runningSum(arr);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0;i< nums.length;i++) {
           sum = sum+ nums[i];
            nums[i] = sum;
        }
        return nums;
    }

}
