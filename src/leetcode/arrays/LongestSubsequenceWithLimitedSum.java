package leetcode.arrays;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,2,1};
        int[] queries = new int[]{3,10,21};
        System.out.println(answerQueries3(nums, queries));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int length = queries.length;
        int[] answers = new int[length];
        insertionSort(nums);
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int sum = 0;
                int count = 0;
                int loop = j;
                while (sum <= queries[i] && loop <= nums.length - 1) {
                    if (!(sum + nums[loop] > queries[i])) {
                        sum = sum + nums[loop];
                        count++;
                    }
                    loop++;
                }
                answers[i] = count;
                break;
            }
        }
        return answers;
    }

    public static int[] answerQueries2(int[] nums, int[] queries) {
        int length = queries.length;
        int[] answers = new int[length];
        insertionSort(nums);
        int sum = 0;
        int count = 0;
        int loop = 0;
        for (int i = 0; i < queries.length; i++) {
            while (sum <= queries[i] && loop <= nums.length - 1) {
                if (!(sum + nums[loop] > queries[i])) {
                    sum = sum + nums[loop];
                    count++;
                }
                loop++;
            }
            answers[i] = count;
        }
        return answers;
    }

    private static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && current < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }

    public static int[] answerQueries3(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] sums = new int[nums.length];

        sums[0] = nums[0];

        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        for (int i = 0; i < queries.length; i++) {
            queries[i] = binarySearch(sums, queries[i]);
        }

        return queries;
    }

    public static int binarySearch(int[] sums, int num) {
        int low = 0;
        int high = sums.length;

        while (low < high) {
            int mid = (low + high) >>> 1;

            if (sums[mid] > num) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    public static int[] answerQueries4(int[] nums, int[] queries) {
        insertionSort(nums);
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        for (int i = 0; i < queries.length; i++) {
            queries[i] = binarySearch(sums, queries[i]);
        }

        return queries;
    }


}
