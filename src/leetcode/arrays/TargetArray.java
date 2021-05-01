package leetcode.arrays;

public class TargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] tArray = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            if (index[i] == i) {
                tArray[index[i]] = nums[i];
            } else if (index[i] < i) {
                int temp = 0;
                for (int j = index[i]; j < i+1; j++) {
                    int temp2;
                    if (j == index[i]) {
                        temp = tArray[j];
                        tArray[j] = nums[i];
                    } else {
                        temp2 = temp;
                        temp = tArray[j];
                        tArray[j] = temp2;
                    }
                }
            } else if(index[i] > i){
                tArray[index[i]] = nums[i];
            }
        }
        return tArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
        int[] target = createTargetArray2(nums, index);
        for (int i : target) {
            System.out.print(i);
        }
    }

    public static int[] createTargetArray2(int[] nums, int[] index) {
        int[] tArray = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            if (index[i] == i) {
                tArray[index[i]] = nums[i];
            } else if (index[i] < i) {
                int temp = 0;
                for (int j = index[i]; j < i+1; j++) {
                    temp = tArray[j];
                    tArray[j] = nums[i];
                    nums[i] = temp;
                }
            } else if(index[i] > i){
                tArray[index[i]] = nums[i];
            }
        }
        return tArray;
    }

}
