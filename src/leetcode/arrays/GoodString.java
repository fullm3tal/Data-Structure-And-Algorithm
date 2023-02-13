package leetcode.arrays;

import java.util.*;

public class GoodString {

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        System.out.println(countCharacters2(words, "atach"));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            Character c = chars.charAt(i);
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }
        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>(maps);
            int increment = 0;
            for (int i = 0; i < word.length(); i++) {
                Character key = word.charAt(i);
                if (map.containsKey(key) && map.get(key) > 0) {
                    increment++;
                    map.put(key, map.getOrDefault(key, 0) -1);
                }
            }
            if (increment == word.length()) {
                count = count + word.length();
            }
        }
        return count;
    }


    public static int countCharacters2(String[] words, String chars) {
        int count = 0;
        int []characters = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            characters[chars.charAt(i) - 'a']++;
        }
        for (String word : words) {
            int [] array = Arrays.copyOf(characters, 26);
            int increment = 0;
            for (int i = 0; i < word.length(); i++) {
                int index  = word.charAt(i)- 'a';
                if (array[index] > 0) {
                    increment++;
                    array[index]--;
                }
            }
            if (increment == word.length()) {
                count = count + word.length();
            }
        }
        return count;
    }


}
