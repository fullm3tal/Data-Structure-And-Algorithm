package leetcode.arrays;

public class LuckyNumber {

    public static void main(String[] args) {
        int [] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        int number = -1;
        int []nums = new int[501];
        for (int i=0;i<arr.length;i++) {
            nums[arr[i]]++;
        }
        for (int i=0;i<nums.length;i++) {
            if( nums[i] == i){
                number = i;
            }
        }
        return number;
    }


}
