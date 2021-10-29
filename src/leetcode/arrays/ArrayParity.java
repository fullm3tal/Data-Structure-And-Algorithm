package leetcode.arrays;

public class ArrayParity {

    public static int[] sortArrayByParity(int[] A) {
//        [3,1,2,4]
        int temp = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                temp = i;
            } else {
                if (temp < 0)
                    temp = A[i];
            }
        }
        return A;
    }

}
