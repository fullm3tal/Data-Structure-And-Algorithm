package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class IncreasingFrequency {

    public static int[] frequencySort(int[] nums) {
        int[] arr = new int[200];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr[Math.abs(nums[i]) + 100]++;
            } else {
                arr[nums[i]]++;
            }
        }
        int index = 0;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            int min = 102;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    pos = j;
                }
            }
            while (min > 0) {
                nums[index] = pos;
                index++;
                min--;
            }
            arr[pos] = 111;
        }
        return nums;
    }


    public static int[] frequencySort2(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            maps.put(nums[i], maps.getOrDefault(nums[i], 0) + 1);
        }
        int size =maps.size();
        int index = 0;
        for (int i = 0; i < size; i++) {
            int pos = -111;
            int min = 111;
            for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
                if (map.getValue() <= min) {
                    if (map.getValue() == min) {
                        if (map.getKey() > pos) {
                            min = map.getValue();
                            pos = map.getKey();
                        }
                    } else {
                        min = map.getValue();
                        pos = map.getKey();
                    }
                }
            }
            while (min > 0) {
                nums[index] = pos;
                index++;
                min--;
            }
            maps.remove(pos);
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(frequencySort2(nums));
    }

}
