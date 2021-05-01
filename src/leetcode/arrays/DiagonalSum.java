package leetcode.arrays;

public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = 0, k = mat[0].length - 1;
            for (int i = 0; i < mat.length; i++) {
                sum = sum + mat[i][j] + mat[k][j];
                if (i==j && j==k){
                    sum = sum - mat[i][j];
                }
                k--;
                j++;
            }
            return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int sum = diagonalSum(arr);
        System.out.println(sum);
    }

}
