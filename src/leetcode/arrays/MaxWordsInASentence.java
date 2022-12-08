package leetcode.arrays;

public class MaxWordsInASentence {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for (String sentence : sentences) {
            String []array =  sentence.split(" ");
            if(array.length > count) {
                count = array.length;
            }
        }
        return count;
    }
}
