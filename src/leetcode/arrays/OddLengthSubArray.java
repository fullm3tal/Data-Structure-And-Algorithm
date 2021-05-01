package leetcode.arrays;

public class OddLengthSubArray {

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +addIncrementArray(i, i, arr);
        }
        return sum;
    }

    private static int addIncrementArray(int index, int count, int[] arr) {
        int sum = 0;
        for (int i = index; i <= count; i++) {
            sum = sum + arr[i];
        }
        if (count+2 < arr.length) {
            sum = sum + addIncrementArray(index, count + 2, arr);
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays2(arr));
    }

    public static int sumOddLengthSubarrays2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i]*(((i+1)*(arr.length-i)+1)/2));
        }
        return sum;
    }

}

