package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceFromCharacter {

    public static void main(String[] args) {
//        [3,2,1,0,1,0,0,1,2,2,1,0]
        String s = "loveleetcode";
        System.out.println(shortestToChar2(s, 'e'));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] nums = new int[s.length()];
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i))
                indexes.add(i);
        }
        for (int i = 0; i < s.length(); i++) {
            int closest = Integer.MAX_VALUE;
            for (int n : indexes) {
                int distance = Math.abs(n - i);
                if (distance < closest) {
                    closest = distance;
                }
                if (distance == 0) {
                    break;
                }
            }
            nums[i] = closest;
        }
        return nums;
    }

    public static int[] shortestToChar2(String s, char c) {
        int[] nums = new int[s.length()];
        int occurrenceC = 0;
        boolean firstOccurrence = true;
        for (int i = 0; i < s.length(); i++) {
            int index = occurrenceC;
            if (c == s.charAt(i) && firstOccurrence) {
                firstOccurrence = false;
                while (index <= s.length() - 1) {
                    nums[index] = Math.abs(i - index);
                    index++;
                }
                occurrenceC = i;
            } else if (c == s.charAt(i)) {
                while (index <= s.length() - 1) {
                    nums[index] = Math.min(Math.abs(i - index), nums[index]);
                    index++;
                }
                occurrenceC = i;
            }
        }
        return nums;
    }


}
