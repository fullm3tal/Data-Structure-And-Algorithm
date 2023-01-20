package leetcode.arrays;

public class SmallestIndexWithEqualValue {

    public int smallestEqual(int[] nums) {
        int value = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(15 % 10);
    }

}
