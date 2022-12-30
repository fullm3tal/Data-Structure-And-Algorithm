package leetcode.arrays;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 2};
        int[] arr2 = new int[]{4, 3, 3};
        int[] arr3 = new int[]{5};
        System.out.println(twoOutOfThree2(arr1, arr2, arr3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len3 = nums3.length;
        int largest = 0;
        largest = Math.max(len1, len2);
        largest = Math.max(largest, len3);

        for (int i = 0; i < largest; i++) {
            if (i < nums1.length) {
                set1.add(nums1[i]);
            }
            if (i < nums2.length) {
                set2.add(nums2[i]);
            }
            if (i < nums3.length) {
                set3.add(nums3[i]);
            }
        }

        for (int i = 0; i < largest; i++) {
            if (i < nums1.length && ((set1.contains(nums1[i]) && set2.contains(nums1[i])) || (set1.contains(nums1[i]) && set3.contains(nums1[i])) ||
                    (set2.contains(nums1[i]) && set3.contains(nums1[i])))) {
                set.add(nums1[i]);
            }
            if (i < nums2.length && ((set1.contains(nums2[i]) && set2.contains(nums2[i])) || (set1.contains(nums2[i]) && set3.contains(nums2[i])) ||
                    (set2.contains(nums2[i]) && set3.contains(nums2[i])))) {
                set.add(nums2[i]);
            }
            if (i < nums3.length && ((set1.contains(nums3[i]) && set2.contains(nums3[i])) || (set1.contains(nums3[i]) && set3.contains(nums3[i])) ||
                    (set2.contains(nums3[i]) && set3.contains(nums3[i])))) {
                set.add(nums3[i]);
            }
        }
        return new ArrayList<>(set);
    }

    public static List<Integer> twoOutOfThree2(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr1 = new int[101];
        int[] arr2 = new int[101];
        int[] arr3 = new int[101];
        for (int i : nums1) arr1[i] = 1;
        for (int i : nums2) arr2[i] = 1;
        for (int i : nums3) arr3[i] = 1;
        List<Integer> list = new ArrayList<>();
        for (int i =0;i< 101;i++) {
            if(arr1[i]+ arr2[i] + arr3[i] >= 2) {
                list.add(i);
            }
        }
        return list;
    }



}

