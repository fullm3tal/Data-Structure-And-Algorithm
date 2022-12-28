package leetcode.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueOccurences {

    public static void main(String[] args) {
//        int[] arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
//        int[] arr = new int[]{1,2};
        int[] arr = new int[]{1,2,2,1,1,3};
        System.out.println(uniqueOccurrences3(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            nums.put(arr[i], Math.abs(nums.getOrDefault(arr[i], 0)) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            int value = entry.getValue();
            if (set.contains(value)) {
                return false;
            }
            set.add(value);
        }
        return true;
    }

    public static boolean uniqueOccurrences2(int[] arr) {
        int[] nums = new int[2002];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (Integer.signum(arr[i]) < 0) {
                nums[arr[i]+1000]++;
            } else {
                nums[arr[i]]++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0 && set.contains(nums[j])) {
                return false;
            }
            set.add(nums[j]);
        }

        return true;
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static boolean uniqueOccurrences3(int[] arr) {
        int min = arr[0], max = min;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int diff = max - min;
        int[] counts = new int[diff + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - min;
            counts[arr[i]]++;
        }

        boolean[] countUsed = new boolean[arr.length + 1];
        for (int i = 0; i <= diff; i++) {
            if (counts[i] != 0 && countUsed[counts[i]]) return false;
            countUsed[counts[i]] = true;
        }
        return true;
    }


}
