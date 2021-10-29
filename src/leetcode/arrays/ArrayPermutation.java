package leetcode.arrays;

public class ArrayPermutation {

    public static void main(String[] args) {
//        Output: [4,5,0,1,2,3]
        int[] arr = {5,0,1,2,3,4};
        for (int i : buildArray(arr)) {
            System.out.print(i+" ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int []newArr = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            newArr[i] = nums[nums[i]];
        }
        return newArr;
    }

}
