package leetcode.arrays;

import java.util.BitSet;
import java.util.HashSet;

public class MultiplyValuesByTwo {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 6, 1, 12};
        System.out.println(findFinalValue3(arr, 3));
    }

    public static int findFinalValue(int[] nums, int original) {
        HashSet<Integer> values = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }
        while (values.contains(original)) {
            original = original * 2;
        }
        return original;
    }

    public static int findFinalValue2(int[] nums, int original) {
        int[] arr = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = nums[i];
        }
        while (original <= 1000 && original == arr[original]) {
            original = original * 2;
        }
        return original;
    }

    public static int findFinalValue3(int[] nums, int original) {
        BitSet[] arr = new BitSet[1001];
        BitSet bitSet = new BitSet(1);
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = bitSet;
        }
        while (original <= 1000 &&  arr[original] == bitSet) {
            original = original * 2;
        }
        return original;
    }

}
