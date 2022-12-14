package leetcode.arrays;

public class PrefArrays {

    public static void main(String[] args) {
        System.out.println("pay".subSequence(0, 2));
//        String[] words = new String[]{"pay", "attention", "practice", "attend"};
        String[] words = new String[]{"leetcode","win","loops","success"};
        System.out.println(prefixCount3(words, "code"));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = words.length;
        for (String word : words) {
            if(word.length() < pref.length()) {
                count--;
            } else {
                for (int i = 0; i < pref.length(); i++) {
                    if (pref.charAt(i) != word.charAt(i)) {
                        count--;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static int prefixCount2(String[] words, String pref) {
        int count = words.length;
        for (String word : words) {
            if(word.length() < pref.length()) {
                count--;
            } else {
                if(!pref.equalsIgnoreCase(word.substring(0,pref.length()))){
                    count--;
                }
            }
        }
        return count;
    }

    public static int prefixCount3(String[] words, String pref) {
        int count = words.length;
        for (int j= 0;j< words.length;j++) {
            if(words[j].length() < pref.length()) {
                count--;
            } else {
                if(!pref.equalsIgnoreCase(words[j].substring(0,pref.length()))){
                    count--;
                }
            }
        }
        return count;
    }

}
