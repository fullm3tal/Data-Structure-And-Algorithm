package leetcode.arrays;

public class LongestContigousSegment {

    public static void main(String[] args) {
        String  s = "0111010011";
        System.out.println( checkZeroOnes(s));
    }

    public static boolean checkZeroOnes(String s) {
        int zero = 0;
        int one = 0;
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (count1 > one) {
                    one = count1;
                }
                count1 = 0;
                count0++;
            } else {
                if (count0 > zero) {
                    zero = count0;
                }
                count0 = 0;
                count1++;
            }
        }
        if (count1>0){
            if (count1 > one) {
                one = count1;
            }
        }
        if (count0 > 0) {
            if (count0 > zero) {
                zero = count0;
            }
        }

        if (one > zero) {
            return true;
        }
        return false;
    }


}
