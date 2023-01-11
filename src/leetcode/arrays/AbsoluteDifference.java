package leetcode.arrays;

public class AbsoluteDifference {

    public static int countKDifference(int[] nums, int k) {
        int diff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) == k) {
                    diff++;
                }
            }
        }
        return diff;
    }

    public static int countKDifference2(int[] nums, int k) {
        final int kMax = 100;
        int ans = 0;
        int[] count = new int[kMax + 1];

        for (final int num : nums)
            ++count[num];

        for (int i = k + 1; i <= kMax; ++i)
            ans += count[i] * count[i - k];

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 4};
//        int[] arr = new int[]{1, 2, 2, 1};
        System.out.println(countKDifference2(arr, 2));
    }

}
