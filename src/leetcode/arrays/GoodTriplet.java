package leetcode.arrays;

public class GoodTriplet {
    //        [0,1,2,3,4,5]
    //    [3,0,1,1,9,7]
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int countGoodTriplets2(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if ((Math.abs(arr[i] - arr[j]) <= a)){
                    for (int k = j + 1; k < arr.length; k++) {
                        if ((Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        System.out.println(countGoodTriplets(arr, 7, 2, 3));
    }

}
