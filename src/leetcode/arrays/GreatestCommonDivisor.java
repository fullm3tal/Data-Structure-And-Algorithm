package leetcode.arrays;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
//        int[] arr = new int[]{2, 5, 6, 9, 10};
        int[] arr = new int[]{7, 5, 6, 8, 3};
        System.out.println(findGCD(arr));
    }

    public static int findGCD(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        int count = largest;
        while (count >= 1) {
            if (largest % count == 0 && smallest % count == 0) {
                return count;
            }
            count--;
        }
        return count;
    }

}
