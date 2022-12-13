package leetcode.arrays;

public class PalindromeString {

    public static void main(String[] args) {
        String []words = new String[] {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        boolean isPalindrome = true;
        for (int l = 0;l<words.length; l++) {
            isPalindrome = true;
            for (int i =0, j= words[l].length() -1 ;i<words[l].length()/2;i++, j--) {
                if(words[l].charAt(i) != words[l].charAt(j)) {
                    isPalindrome= false;
                    break;
                }
            }
            if(isPalindrome) {
                return words[l];
            }
        }
        return "";
    }
}
