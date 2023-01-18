package leetcode.arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        System.out.println(missingNumber2(arr));
    }

    public static int missingNumber2(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = 1;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                index = i;
                break;
            }
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }

        if (nums.length == 1) {
            if (index == 0) {
                return index + 1;
            } else {
                return index - 1;
            }
        }

        if (index == 0) {
            return length + 1;
        } else {
            return index - 1;
        }
    }

    public static int missingNumber(int[] nums) {
        insertionSort(nums);
        for (int i = 0, j = nums[0]; i < nums.length; i++, j++) {
            if (j != nums[i]) {
                return j;
            }
        }
        if (nums.length == 1) {
            if (nums[0] == 0) {
                return nums[0] + 1;
            } else {
                return nums[0] - 1;
            }
        }

        if (nums[0] == 0) {
            return nums[nums.length - 1] + 1;
        } else {
            return nums[0] - 1;
        }
    }


    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
