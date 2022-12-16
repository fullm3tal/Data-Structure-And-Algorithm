package leetcode.arrays;

public class CountEqualandDivisiblePairsinanArray {

    public static void main(String[] args) {
//        int[] arr = new int[]{3,1,2,2,2,1,3};
        int[] arr = new int[]{5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        System.out.println(countPairs(arr, 2));
    }

    public static int countPairs(int[] nums, int k) {
        int count =0;
        for (int i = 0;i<nums.length-1;i++) {
            for (int j=i+1; j<nums.length;j++) {
                if(nums[i]==nums[j] && (i*j)%k ==0) {
                    count++;
                }
            }
        }
        return count;
    }

}
