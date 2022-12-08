package leetcode.arrays;

public class NumberOfConsistentStrings {

    public static void main(String[] args) {
        String allowed = "ab";
        String []words = new String[]{"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean contains = true;
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                count++;
            }
        }
        return count;
    }

}
