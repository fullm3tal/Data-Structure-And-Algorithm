package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class DividePairs {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,2,2,2};
        System.out.println(divideArray2(arr));
    }

    public static boolean divideArray(int[] nums) {
        boolean containsPairs = false;
        insertionSort(nums);
        int count = 0;
        int current = nums[0];
        for (int i = 1; i < nums.length; i = i + 2) {
        }

        return containsPairs;
    }

    public static boolean divideArray1(int[] nums) {
        boolean containsPairs = true;
        int[] arr = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                containsPairs = false;
                break;
            }
        }
        return containsPairs;
    }

    public static boolean divideArray2(int[] nums) {
        //int x = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            //x ^= nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(var k : map.entrySet()){
            //System.out.println(k.getKey()+","+k.getValue());
            if((k.getValue()&1)>0){
                return false;
            }
        }

        return true;
    }


    private static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && current < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }

}
