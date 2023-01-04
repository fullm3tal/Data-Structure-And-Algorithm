package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class GroupPeople {

    public static void main(String[] args) {
        int[] people = new int[]{3, 3, 3, 3, 3, 1, 3};
        System.out.println(groupThePeople(people));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        int[] tempArray = new int[100];
        List<List<Integer>> list = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < groupSizes.length; i++) {
            if (tempArray[groupSizes[i]] == 0) {
                tempArray[groupSizes[i]] = count;
                list.add(tempArray[groupSizes[i]] - 1, new ArrayList<>());
                count++;
            }
            List<Integer> insertValues = list.get(tempArray[groupSizes[i]] - 1);
            if (insertValues.size() == groupSizes[i]) {
                tempArray[groupSizes[i]] = count;
                count++;
                list.add(tempArray[groupSizes[i]] -1 , new ArrayList<>());
                insertValues = list.get(tempArray[groupSizes[i]] - 1);
                insertValues.add(i);
            } else {
                insertValues.add(i);
            }
        }
        return list;
    }

}
