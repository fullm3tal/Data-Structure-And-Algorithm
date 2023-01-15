package leetcode.arrays;


public class StrictlyIncreasing {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 10, 5, 7};
        int[] arr = new int[]{1, 1, 1};
//        int[] arr = new int[]{2, 3, 1, 2};
//        int[] arr = new int[]{100, 21, 100};
        System.out.println(canBeIncreasing2(arr));
    }

    public static boolean canBeIncreasing1(int[] nums) {
        int length = nums.length;
        if (length == 2) return true;
        int peek = -1;
        for (int i = 1; i < length; i++) {
            if (!(nums[i] > nums[i - 1])) {
                if (peek != -1) return false;
                peek = i;
            }
        }
        if (peek == 1 || peek == length - 1) return true;
        return peek == -1 || (nums[peek] > nums[peek - 2]) || (nums[peek + 1] > nums[peek - 1]);
    }

    public boolean canBeIncreasing(int[] nums) {
        if (nums.length == 2) return true;
        int peek = -1;
        for (int i = 1; i < nums.length; i++) {
            if (!(nums[i] > nums[i - 1])) {
                if (peek != -1) return false;
                peek = i;
            }
        }
        if (peek == 1 || peek == nums.length - 1) return true;
        return peek == -1
                || nums[peek] > nums[peek - 2]
                || nums[peek + 1] > nums[peek - 1];
    }

    //    [1,2,10,5,7]
    public static boolean canBeIncreasing2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isIncreasing = true;
            for (int j = 0; j < nums.length - 1; j++) {
                int next = j + 1;
                if (i != j) {
                    if (next == i) {
                        next++;
                        if (next >= nums.length) {
                            continue;
                        }
                    }
                    if (nums[j] >= nums[next]) {
                        isIncreasing = false;
                    }
                }
            }
            if (isIncreasing) {
                return true;
            }
        }
        return false;
    }

}
