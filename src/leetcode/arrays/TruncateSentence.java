package leetcode.arrays;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String []array =  s.split(" ");
        StringBuilder firstK = new StringBuilder();
        for (int i = 0; i<k; i++) {
            firstK.append(array[i]).append(" ");
        }
        return firstK.toString().trim();
    }
}
