package leetcode.arrays;

public class DifferenceOfSum {

    static int digitSum = 0;

    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > 9) {
                numbers(nums[i]);
            } else {
                digitSum += nums[i];
            }
        }
        return  Math.abs(sum - digitSum);
    }

    public static void numbers(int num) {
        if (num > 0) {
            numbers(num/10);
            digitSum += num % 10;
        }
    }

    public static void main(String[] args) {
//        int [] arr = {1,15,6,3};
        int [] arr = {1,2,3,4};
        System.out.println(differenceOfSum(arr));
//        numbers(197897);
    }

}
