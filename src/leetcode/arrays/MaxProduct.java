package leetcode.arrays;

public class MaxProduct {

    public static void main(String[] args) {
        int []arr = {10,4,5,2};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int product = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp;
            if (nums[i] >= product) {
                temp = product;
                product = nums[i];
                if (temp >= second) {
                    second = temp;
                }
            } else{
                if (nums[i] >= second) {
                    second = nums[i];
                }
            }
        }
        product = (product-1) * (second-1);
        return product;
    }

}
