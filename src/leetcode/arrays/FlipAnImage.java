package leetcode.arrays;

public class FlipAnImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0, k = image[i].length - 1; j < image[i].length / 2; j++, k--) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
            }
            for (int k = 0; k < image[i].length; k++) {
                image[i][k] ^= 1;
            }
        }
        return image;
    }

    public static void main(String[] args) {
//        [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//        int [][]arr = {{1}};
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] newArr = flipAndInvertImage(arr);
//        int[] arr = {1, 2, 3};
//        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
        System.out.println();
    }

}

