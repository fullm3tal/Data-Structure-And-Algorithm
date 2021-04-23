package leetcode.arrays;

import java.util.ArrayList;

public class Decompress {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newArray = decompressRLElist2(arr);
        for (int i : newArray) {
            System.out.println(i);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
            i = i + 2;
        }
        return list.stream().mapToInt(k -> k).toArray();
    }

    public static int[] decompressRLElist2(int[] nums) {
        int len = 0;
        for (int p = 0; p < nums.length; p = p + 2) {
            len = len + nums[p];
        }
        int[] array = new int[len];
        int i = 0;
        int count = 0;
        while (i < nums.length) {
            for (int j = 0; j < nums[i]; j++) {
                array[count] = nums[i + 1];
                count++;
            }
            i = i + 2;
        }
        return array;
    }


}
