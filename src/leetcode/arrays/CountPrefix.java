package leetcode.arrays;

public class CountPrefix {

    public static void main(String[] args) {
       String  [] arr = new String[] { "a","b","c","ab","bc","abc" };
        System.out.println(countPrefixes(arr, "abc"));
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i =0;i<words.length;i++) {
            if(s.startsWith(words[i])){
                count++;
            }
        }
        return count;
    }

}
