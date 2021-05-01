package leetcode.arrays;

public class EvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        int pCount = 0;
        for (int number : nums) {
            while (number != 0) {
                number = number / 10;
                pCount++;
            }
            if (pCount % 2 == 0) {
                count++;
            }
            pCount = 0;
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] nums = {12, 345, 2, 6, 7896};
//        int n = findNumbers(nums);
        int el = 231;
        int ans = (el /100000 > 0 ? 1 : (el /10000 > 0 ? 0 : (el /1000 > 0 ? 1 : (el /100 > 0 ? 0 : (el /10 > 0 ? 1 : 0)))));
        System.out.println(ans);
    }

}
