package leetcode.arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] array = shuffle(nums, n);
        for (int i : array) {
            System.out.println(i);
        }
    }


    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int k = 0;
        for (int i = 0, j = n; i < n; i++, j++) {
            arr[k++] = nums[i];
            arr[k++] = nums[j];
        }
        return arr;
    }

}
