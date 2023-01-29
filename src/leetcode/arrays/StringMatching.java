package leetcode.arrays;

import java.util.*;

public class StringMatching {

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        StringBuilder test = new StringBuilder("[" + words[0] + "]");
        for (int i = 1; i < words.length; i++) {
            test.append("[").append(words[i]).append("]");
        }
        String target = test.toString();
        for (int i = 0; i < words.length; i++) {
            target = target.replace("[" + words[i] + "]", "[]");
            if (target.contains(words[i])) {
                result.add(words[i]);
            }
            target = target.replace("[]", "[" + words[i] + "]");
        }
        return result;
    }

    public static List<String> stringMatching2(String[] words) {
        List<String> result = new ArrayList<>();
        String target = "[" + words[0] + "]";
        for (int i = 1; i < words.length; i++) {
            target = target  +   "[" + words[i] + "]";
        }
        for (int i = 0; i < words.length; i++) {
            target = target.replace("[" + words[i] + "]", "[]");
            if (target.contains(words[i])) {
                result.add(words[i]);
            }
            target = target.replace("[]", "[" + words[i] + "]");
        }
        return result;
    }

    public static void main(String[] args) {
//        String[] words = {"mass", "as", "hero", "superhero"};
        String[] words = {"gghid", "kgghida", "kszt", "bxkgghidam", "fqqym", "bxkgghidamq"};
        System.out.println(stringMatching2(words));
    }

}
