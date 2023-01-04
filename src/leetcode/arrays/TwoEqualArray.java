package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoEqualArray {

    public static void main(String[] args) {
        int[] target = new int[]{3, 7, 9};
        int[] arr = new int[]{2, 4, 1};
        System.out.println(canBeEqual2(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] temp = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        for (int j = 0; j < target.length; j++) {
            temp[target[j]]--;
        }

        for (int k = 0; k < temp.length; k++) {
            if (temp[k] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean canBeEqual2(int[] target, int[] arr) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            maps.put(arr[i], maps.getOrDefault(arr[i], 0) + 1);
        }
        for (int j = 0; j < target.length; j++) {
            int value =  maps.getOrDefault(target[j], 0);
            if(value < 0) {
                return false;
            }
            maps.put(target[j], value - 1);
        }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

}
