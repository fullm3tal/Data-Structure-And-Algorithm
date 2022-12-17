package leetcode.arrays;

public class DeleteGreatest {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 2, 4}, {3, 3, 1}};
        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int width = grid[0].length;
        int height = grid.length;
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            insertionSort(grid[i]);
        }
        for (int j = 0; j < width; j++) {
            int[] arr = new int[height];
            for (int k = 0; k < height; k++) {
                arr[k] = grid[k][j];
            }
            insertionSort(arr);
            sum = sum + arr[0];
        }
        return sum;
    }

//    public static int deleteGreatestValue2(int[][] grid) {
//        int width = grid[0].length;
//        int height = grid.length;
//        int sum = 0;
//        for (int i = 0; i < grid.length; i++) {
//            sort(grid[i], 0, width);
//        }
//        for (int j = 0; j < width; j++) {
//            int[] arr = new int[height];
//            for (int k = 0; k < height; k++) {
//                arr[k] = grid[k][j];
//            }
//            sort(arr, 0, width);
//            sum = sum + arr[0];
//        }
//        return sum;
//    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && current > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

//    static void merge(int arr[], int l, int m, int r)
//    {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        /* Create temp arrays */
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        /*Copy data to temp arrays*/
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[m + 1 + j];
//
//        /* Merge the temp arrays */
//
//        // Initial indexes of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        /* Copy remaining elements of L[] if any */
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        /* Copy remaining elements of R[] if any */
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    // Main function that sorts arr[l..r] using
//    // merge()
//    static void sort(int arr[], int l, int r)
//    {
//        if (l < r) {
//            // Find the middle point
//            int m = l + (r - l) / 2;
//
//            // Sort first and second halves
//            sort(arr, l, m);
//            sort(arr, m + 1, r);
//
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//        }
//    }

}
