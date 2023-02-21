package leetcode.arrays;

public class ProductArray {

    public static int arraySign(int[] nums) {
        double product =1;
        for (int i=0;i<nums.length;i++) {
            product *= nums[i];
        }
        if(product > 0) {
            return 1;
        } else if(product < 0) {
            return -1;
        }
        return 0;
    }

}
