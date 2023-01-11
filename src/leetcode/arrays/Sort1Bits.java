package leetcode.arrays;

import java.util.*;

public class Sort1Bits {

    public static void main(String[] args) {
//        int[] arr = new int[]{0,1,2,3,4,5,6,7,8};
        int[] arr = new int[]{7850, 8192, 1878, 2687, 6878, 7410, 763, 365, 9869, 8744, 2741, 4871, 5844, 2715, 3335, 9651, 6677};
        System.out.println(sortByBits(arr));
    }

    public static int[] sortByBits(int[] arr) {
        List<Integer> comp = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        DeleteGreatest.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            comp.add(getBinary1Count(arr[i]));
        }
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int count = i - 1;
            if (comp.get(i) < comp.get(count)) {
                while (count >= 0 && comp.get(i) < comp.get(count)) {
                    --count;
                }
                comp.add(count + 1, comp.get(i));
                comp.remove(i + 1);
                list.add(count + 1, arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static int getBinary1Count(int number) {
        return Integer.toBinaryString(number).replace("0", "").length();
    }

//    [8192,8744,365,3335,4871,6677,1878,2715,2741,5844,9869,763,7410,7850,9651,2687,6878]

}
