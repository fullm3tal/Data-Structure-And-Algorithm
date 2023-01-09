package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestLocalValues {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}
        };
        System.out.println(largestLocal(grid));
    }

    private static Map<Integer, Integer> getIndex(int value, int arrayLength) {
        Map<Integer, Integer> maps = new HashMap<>();
        if (value <= arrayLength) {
            maps.put(0, value);
        } else {
            maps.put(value / arrayLength, value % arrayLength);
        }
        return maps;
    }

    public static int[][] largestLocal(int[][] grid) {
        int len = grid.length - 2;
        int[][] result = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                result[i][j] = getMax2(grid, i + 1, j + 1);
            }
        }
        return result;
    }

    public static int getMax2(int[][] grid, int i, int j) {
        int max = grid[i][j];
        max = Math.max(grid[i][j-1], max);
        max = Math.max(grid[i][j+1], max);
        max = Math.max(grid[i-1][j-1], max);
        max = Math.max(grid[i-1][j+1], max);
        max = Math.max(grid[i+1][j-1], max);
        max = Math.max(grid[i+1][j+1], max);
        max = Math.max(grid[i+1][j], max);
        max = Math.max(grid[i-1][j], max);
        return max;
    }

    public static int[][] largestLocal1(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                ans[i][j] = getMax(grid, i + 1, j + 1);
            }
        }
        return ans;
    }

    private static int getMax(int[][] grid, int i, int j) {
        int max = grid[i][j];
        max = Math.max(max, grid[i][j - 1]);
        max = Math.max(max, grid[i - 1][j - 1]);
        max = Math.max(max, grid[i - 1][j]);
        max = Math.max(max, grid[i - 1][j + 1]);
        max = Math.max(max, grid[i][j + 1]);
        max = Math.max(max, grid[i + 1][j + 1]);
        max = Math.max(max, grid[i + 1][j]);
        max = Math.max(max, grid[i + 1][j - 1]);
        return max;
    }


}
