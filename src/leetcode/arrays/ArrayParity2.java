package leetcode.arrays;

public class ArrayParity2 {

    public static void main(String[] args) {
//        int[] nums = {4, 2, 5, 7};
//        int[] nums = {2, 3};
        int[] nums = {3, 4};
//        int[] nums = {648, 831, 560, 986, 192, 424, 997, 829, 897, 843};
        System.out.println(sortArrayByParityII3(nums));
//        System.out.println(1 % 2);
    }

    public static int[] sortArrayByParityII(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            int temp = nums[i];
            if (i % 2 == 0) {
                while (nums[index] % 2 != 0) {
                    index++;
                }
            } else {
                while (nums[index] % 2 == 0) {
                    index++;
                }
            }
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }

    public static int[] sortArrayByParityII2(int[] nums) {
        int lastEven = 0;
        int lastOdd = 1;
        int temp = -1;
        int len = nums.length;
        while (lastEven < len && lastOdd < len) {
            if (nums[lastEven] % 2 == 0) {
                lastEven = lastEven + 2;
            }
            if (nums[lastOdd] % 2 == 1) {
                lastOdd = lastOdd + 2;
            }
            if (lastOdd < len && nums[lastOdd] % 2 != 1 && nums[lastEven] % 2 != 0) {
                temp = nums[lastEven];
                nums[lastEven] = nums[lastOdd];
                nums[lastOdd] = temp;
                lastEven = lastEven + 2;
                lastOdd = lastOdd + 2;
            }
        }
        return nums;
    }

    public static int[] sortArrayByParityII3(int[] nums) {
        int[] bucket = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }
        int even = 0;
        int odd = 1;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] > 0) {
                while (bucket[i] > 0) {
                    if (i % 2 == 0) {
                        nums[even] = i;
                        even = even + 2;
                    } else {
                        nums[odd] = i;
                        odd = odd + 2;
                    }
                    bucket[i]--;
                }
            }
        }
        return nums;
    }


}
