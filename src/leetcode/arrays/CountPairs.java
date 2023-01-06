package leetcode.arrays;

import java.util.*;

public class CountPairs {

    public int similarPairs4(String[] words) {
        int count = 0;
        List<String> list = new ArrayList<>();
        Set<Character> chars = new HashSet<>();
        for (String word : words) {
            chars.clear();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }
            String actual = chars.toString();
            for (String nums : list) {
                if (nums.equals(actual)) {
                    count++;
                }
            }
            list.add(actual);
        }
        return count;
    }

    public static int similarPairs(String[] words) {
        int count = 0;
        String[] items = new String[words.length];
        Set<Character> chars = new HashSet<>();
        for (int j = 0; j < words.length; j++) {
            chars.clear();
            for (int i = 0; i < words[j].length(); i++) {
                chars.add(words[j].charAt(i));
            }
            String actual = chars.toString();
            for (String nums : items) {
                if(nums==null) {
                    break;
                }
                if (actual.equalsIgnoreCase(nums)) {
                    count++;
                }
            }
            items[j] = actual;
        }
        return count;
    }

    public static void main(String[] args) {
//        String[] arr = new String[]{"aabb","ab","ba"};
        String[] arr = new String[]{"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(similarPairs(arr));
    }

    public static int similarPairs2(String[] words) {
        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length - 1; i++) {
            set = new HashSet<>(Arrays.asList(words[i].split("")));
            for (int j = i + 1; j < words.length; j++) {
                Set<String> check = new HashSet<>(Arrays.asList(words[j].split("")));
                if (set.equals(check)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int similarPairs3(String[] words) {
        int cnt = words.length;
        int[] masks = new int[cnt];
        byte[] buff = new byte[101];
        for (int i = cnt - 1; i >= 0; i--) {
            int n = words[i].length();
            words[i].getBytes(0, n, buff, 0);
            int bits = 0;
            for (int j = n - 1; j >= 0; j--)
                bits |= (1 << (buff[j] - 'a'));
            masks[i] = bits;
        }

        int pairsCount = 0;
        for (int i = 0; i < cnt - 1; i++) {
            int m = masks[i];
            for (int j = i + 1; j < cnt; j++)
                if ((m ^ masks[j]) == 0)
                    pairsCount++;
        }
        return pairsCount;
    }

}
