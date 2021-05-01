package leetcode.arrays;

import java.util.List;

public class CountMatchRule {


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j;
        if (ruleKey.equals("type")) {
            j = 0;
        } else if (ruleKey.equals("color")) {
            j = 1;
        } else {
            j = 2;
        }
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(j).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
