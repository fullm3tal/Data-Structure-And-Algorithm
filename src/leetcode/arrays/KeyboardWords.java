package leetcode.arrays;

import java.util.*;

public class KeyboardWords {

    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords2(words)));
    }

    public static String[] findWords(String[] words) {
        int length = words.length;
        int increment = 0;
        String[] result = new String[length];
        Set<String> one = new HashSet<>(Arrays.asList("qwertyuiop".split("")));
        Set<String> two = new HashSet<>(Arrays.asList("asdfghjkl".split("")));
        Set<String> three = new HashSet<>(Arrays.asList("zxcvbnm".split("")));
        for (int i = 0; i < length; i++) {
            String word = words[i];
            Set<String> contains = new HashSet<>();
            String value = String.valueOf(word.charAt(0)).toLowerCase();
            if (one.contains(value)) {
                contains = one;
            } else if (two.contains(value)) {
                contains = two;
            } else if (three.contains(value)) {
                contains = three;
            }
            int count = 1;
            while (count < word.length()) {
                String data = String.valueOf(word.charAt(count)).toLowerCase();
                if (!contains.contains(data)) {
                    break;
                }
                count++;
            }
            if (count == word.length()) {
                result[increment] = word;
                increment++;
            }
        }
        int inc = 0;
        for (String c : result) {
            if (c == null) {
                break;
            }
            inc++;
        }
        String[] strings = new String[inc];
        for (int i = 0; i < inc; i++) {
            strings[i] = result[i];
        }
        return strings;
    }

    public static String[] findWords2(String[] words) {
        int length = words.length;
        int increment = 0;
        String[] result = new String[length];
        List<Character> list1 = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        List<Character> list2 = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        List<Character> list3 = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');
        for (int i = 0; i < length; i++) {
            String word = words[i].toLowerCase();
            List<Character> contains = new ArrayList<>();
            char value = word.charAt(0);
            if (list1.contains(value)) {
                contains = list1;
            } else if (list2.contains(value)) {
                contains = list2;
            } else if (list3.contains(value)) {
                contains = list3;
            }
            int count = 1;
            while (count < word.length()) {
                char data = word.charAt(count);
                if (!contains.contains(data)) {
                    break;
                }
                count++;
            }
            if (count == word.length()) {
                result[increment] = word;
                increment++;
            }
        }
        int inc = 0;
        for (String c : result) {
            if (c == null) {
                break;
            }
            inc++;
        }
        String[] strings = new String[inc];
        for (int i =0;i< inc;i++) {
            String val = String.valueOf(result[i].charAt(0));
           result[i] = result[i].replaceFirst(val, val.toUpperCase());
            strings[i] = result[i];
        }
        return strings;
    }


}
