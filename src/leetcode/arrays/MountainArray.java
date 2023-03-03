package leetcode.arrays;

public class MountainArray {

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        if (arr.length ==3 && arr[0] < arr[1] &&  arr[1] > arr[2]) {
            return  true;
        }
        if (arr[0] >= arr[1] || arr[arr.length - 1] >= arr[arr.length - 2]) {
            return false;
        }
        int peak = -1;
        for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i -1] < arr[i] &&  arr[i] > arr[i+1]) {
                if(peak == -1) {
                    peak = arr[i];
                } else {
                    return false;
                }
            }
            if (arr[i -1] == arr[i] ||  arr[i] == arr[i+1]){
                return  false;
            }
        }
        if (peak != -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {6,7,7,8,6};
        System.out.println(validMountainArray(arr));
    }

}
