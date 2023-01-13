package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxSquares {

    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[]{5, 8}, new int[]{3, 9}, new int[]{5, 12}, new int[]{16, 5}};
        System.out.println(countGoodRectangles(arr));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> maps = new HashMap<>();
        int count = 0;
        int max = 0;
        for (int[] rectangle : rectangles) {
            int number = Math.min(rectangle[0], rectangle[1]);
            maps.put(number, maps.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(max < key) {
                max = key;
                count = value;
            }
        }
        return count;
    }

    public static int countGoodRectangles2(int[][] rectangles) {
        int max = Integer.MIN_VALUE, count = 0;
        for(int i = 0; i < rectangles.length; i++){
            rectangles[i][0] = Math.min(rectangles[i][0], rectangles[i][1]);
            if(rectangles[i][0] > max)
                max = rectangles[i][0];
        }
        for(int i = 0; i < rectangles.length; i++){
            if(rectangles[i][0] == max)
                count++;
        }
        return count;
    }
}
