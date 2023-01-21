package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {

    public static List<String> commonChars(String[] words) {
        String[] ref = new String[words[0].length()];

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words[0].length(); i++) {
            ref[i] = String.valueOf(words[0].charAt(i));
        }
        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < ref.length; j++) {
                if (ref[j] != null && !words[i].contains(ref[j])) {
                    ref[j] = null;
                }
                if(ref[j] != null &&  words[i].contains(ref[j])) {
                  words[i] = words[i].replaceFirst(ref[j], "");
                }
            }
        }
        for (int k = 0; k < ref.length; k++) {
            if (ref[k] != null)
                list.add(ref[k]);
        }
        return list;
    }

    public static List<String> commonChars2(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < words.length; i++) {
            String value = words[0];
            for (int j = 0; j < value.length(); j++) {
                String data = String.valueOf(value.charAt(j));
                if (!words[i].contains(data)) {
                    words[j] = null;
                }
                if(words[i].contains(data)) {
                    words[i] = words[i].replaceFirst(data, "");
                }
            }
        }
        for (int k = 0; k < words.length; k++) {
                list.add(String.valueOf(words[0].charAt(k)));
        }
        return list;
    }

    public static void main(String[] args) {
//        String[] words = new String[]{"cool", "lock", "cook"};
        String[] words = new String[]{"bella", "label", "roller"};
        System.out.println(commonChars2(words));
        System.out.println();
    }
}
