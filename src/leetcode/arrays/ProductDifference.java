package leetcode.arrays;

public class ProductDifference {

    public static void main(String[] args) {
        int[] nums = new int[]{1,6,7,5,2,4,10,6,4};
//        int[] nums = new int[]{4, 2, 5, 9, 7, 4, 8};
        System.out.println(maxProductDifference2(nums));
    }

    public static int maxProductDifference(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] < currentNumber) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = currentNumber;
        }
        return (nums[0] * nums[1]) - (nums[nums.length - 2] * nums[nums.length - 1]);
    }

    public static int maxProductDifference2(int[] nums) {
        int first = nums[0];
        int second = 0;
        int third = 0;
        int fourth = nums[0];
        for (int i = 1; i < nums.length; i++) {                       /* int[] nums = new int[]{5,6,2,7,4};*/
            if (first <= nums[i]) {
                second = first;
                first = nums[i];
            } else if (nums[i] >= second) {
                second = nums[i];
            } else if(second == 0) {
                second = nums[i];
            }
            if (fourth >= nums[i]) {
                third = fourth;
                fourth = nums[i];
            } else if (nums[i] <= third) {
                third = nums[i];
            } else if(third == 0) {
                third = nums[i];
            }
        }
        return (first * second) - (third * fourth);
    }

}
