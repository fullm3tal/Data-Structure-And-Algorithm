package leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class HeightChecker {

    public static void main(String[] args) {
        int[] heights = new int[]{8, 1, 4, 7, 6, 4, 1, 2, 2, 7, 5, 5, 4, 8, 5, 7, 4, 5, 2, 8, 5, 2, 8};
        System.out.println(heightChecker6(heights));
    }

    public static int heightChecker6(int[] heights) {
        int[] heightToFreq = new int[101];
        for (int height : heights) {
            heightToFreq[height]++;
        }

        int curHeight = 0;
        for (int i = 0; i < heightToFreq.length; i++) {
            if (heightToFreq[i] != 0) {
                curHeight = i;
                break;
            }
        }

        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }
            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }
        return result;
    }

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] copy = heights.clone();
        for (int i = 1; i < heights.length; i++) {
            int current = heights[i];
            int j = i - 1;
            while (j >= 0 && current < heights[j]) {
                heights[j + 1] = heights[j];
                j--;
            }
            heights[j + 1] = current;
        }
        for (int k = 0; k < copy.length; k++) {
            if (copy[k] != heights[k]) {
                count++;
            }
        }
        return count;
    }

    public static int heightChecker2(int[] heights) {
        int count = 0;
        int[] copy = heights.clone();
        sort(heights, 0, heights.length - 1);
        for (int k = 0; k < copy.length; k++) {
            if (copy[k] != heights[k]) {
                count++;
            }
        }
        return count;
    }

    public static int heightChecker3(int[] heights) {
        int count = 0;
        int[] copy = heights.clone();
        Arrays.sort(heights);
        for (int k = 0; k < copy.length; k++) {
            if (copy[k] != heights[k]) {
                count++;
            }
        }
        return count;
    }

    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static int heightChecker4(int[] heights) {
        int k = 100;
        int[] count = new int[k + 1];

        for (int i = 0; i < heights.length; i++) {
            count[heights[i]]++;
        }

        for (int i = 1; i <= k; i++) {
            count[i] = count[i] + count[i - 1];
        }

        int indices = 0;

        for (int i = heights.length - 1; i >= 0; i--) {
            if (i <= count[heights[i] - 1] - 1 || i > count[heights[i]] - 1) {
                indices++;
            }
        }

        return indices;
    }

    public static int heightChecker5(int[] heights) {
        int[] heightToFreq = new int[101];

        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }

        return result;
    }
}
