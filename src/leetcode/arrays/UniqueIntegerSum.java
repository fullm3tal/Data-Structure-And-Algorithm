package leetcode.arrays;

public class UniqueIntegerSum {

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int count = 1;
        for (int i = 0; i < n-1; i = i + 2) {
            arr[i] = -count;
            arr[i + 1] = count++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = sumZero(5);
        System.out.println();

    }

}
