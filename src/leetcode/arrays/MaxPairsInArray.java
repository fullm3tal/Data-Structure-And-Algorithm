package leetcode.arrays;

public class MaxPairsInArray {

    public static void main(String[] args) {
        int []nums = new int[] {1,2,3,4,5};
        System.out.println(numberOfPairs2(nums).toString());
    }

    public static int[] numberOfPairs(int[] nums) {
        int []result = new int[2];
        insertionSort(nums);
        int i = 0;
        if(nums.length == 1) {
            result[1]= 1;
        } else {
            while (i < nums.length) {
                if (i == nums.length - 1) {
                    result[1] = result[1] + 1;
                    i = i + 2;
                } else {
                    if (nums[i] == nums[i + 1]) {
                        i = i + 2;
                        result[0] = result[0] + 1;
                    } else {
                        i++;
                        result[1] = result[1] + 1;
                    }
                }
            }
        }
        return  result;
    }

    private static void insertionSort(int[] nums) {
        for (int i = 1;i< nums.length;i++) {
            int current = nums[i];
            int j = i-1;
            while (j >=0 && current < nums[j]) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
    }

    public static int[] numberOfPairs2(int[] nums) {
        int [] numberOfPairs = new int[101];

        for (int num : nums) numberOfPairs[num]++;

        int [] ans = new int[2];

        for (int a : numberOfPairs) {
            if (a > 0) {
                ans[0] += a / 2;
                ans[1] += a % 2;
            }
        }

        return ans;
    }

}
