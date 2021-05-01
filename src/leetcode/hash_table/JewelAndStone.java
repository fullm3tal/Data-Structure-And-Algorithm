package leetcode.hash_table;

import java.util.HashMap;

public class JewelAndStone {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (map.containsKey(stones.charAt(i))) {
                map.put(c, map.get(stones.charAt(i)) + 1);
            } else {
                map.put(c, 1);
            }

        }
        for (int j = 0; j < jewels.length(); j++) {
            char c = jewels.charAt(j);
            if (map.containsKey(c)) {
                count = count + map.get(c);
            }
        }
        return count;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()){
            for (char d: jewels.toCharArray()){
                if(c==d){
                    count++;
                    break;
                }
            }
        }

        return count;
    }

}
