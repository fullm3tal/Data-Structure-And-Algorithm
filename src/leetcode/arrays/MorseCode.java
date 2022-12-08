package leetcode.arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        Map wordMap = Map.ofEntries(
                Map.entry("a",".-"),
                Map.entry("b","-..."),
                Map.entry("c","-.-."),
                Map.entry("d","-.."),
                Map.entry("e","."),
                Map.entry("f","..-."),
                Map.entry("g","--."),
                Map.entry("h","...."),
                Map.entry("i",".."),
                Map.entry("j",".---"),
                Map.entry("k","-.-"),
                Map.entry("l",".-.."),
                Map.entry("m","--"),
                Map.entry("n","-."),
                Map.entry("o","---"),
                Map.entry("p",".--."),
                Map.entry("q","--.-"),
                Map.entry("r",".-."),
                Map.entry("s","..."),
                Map.entry("t","-"),
                Map.entry("u","..-"),
                Map.entry("v","...-"),
                Map.entry("w",".--"),
                Map.entry("x","-..-"),
                Map.entry("y","-.--"),
                Map.entry("z","--.."));

        int count = 0;
        Set<String> transformedWords = new HashSet<>();
        for (String letter: words) {
            StringBuilder builder = new StringBuilder("");
            for (int i = 0; i <letter.length();i ++) {
                builder.append(wordMap.get(String.valueOf(letter.charAt(i))));
            }
            transformedWords.add(builder.toString());
        }
        return transformedWords.size();
    }
}