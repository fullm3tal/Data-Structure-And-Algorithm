package leetcode.hash_table;

import java.util.HashMap;
import java.util.Map;

public class RepeatedElement2NArray {

    public int repeatedNTimes(int[] A) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                return A[i];
            }
            map.put(A[i], false);
        }
        return 0;
    }

}
