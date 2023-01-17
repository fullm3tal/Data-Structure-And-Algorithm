package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class KthDistinct {

    public static void main(String[] args) {
        String[] arr = new String[]{"d", "b", "c", "b", "c", "a"};
        System.out.println(kthDistinct(arr, 2));
    }


    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            maps.put(arr[i], maps.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maps.get(arr[i]) == 1) {
                count++;
            }
            if (count == k) {
                return arr[i];
            }
        }
        return "";
    }


}
