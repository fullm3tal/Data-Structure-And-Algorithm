package leetcode.arrays;

public class XOROperationArray {

    public int xorOperation(int n, int start) {
        int sum = start;
        for (int i = 1; i < n; i++) {
            start = start + 2;
            sum = sum ^ start;

        }
        return sum;
    }

    public int xorOperation2(int n, int start) {
        int sum = start;
        for (int i = 1; i < n; i++) {
            sum = sum ^ (start+(2*i));
        }
        return sum;
    }


}


