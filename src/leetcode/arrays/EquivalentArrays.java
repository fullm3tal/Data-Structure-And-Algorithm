package leetcode.arrays;

public class EquivalentArrays {

    public static void main(String[] args) {
        String[] first = {"ab", "c"};
        String[] second = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(first, second));;
    }


    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder a  = new StringBuilder();
      StringBuilder b = new StringBuilder();
        for (int i =0;i<word1.length;i++){
            a.append(word1[i]); }
        for (int i =0;i<word2.length;i++){
           b.append(word2[i]); }
        if(a.toString().equals(b.toString())){
            return true;
        }
        return false;
    }

}
