package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArrayDifference {

    public static void main(String[] args) {

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : set1) {
            if (!set2.contains(num)) {
                list2.add(num);
            }
        }
        list.add(list2);
        list.add(list1);
        return list;
    }

}
