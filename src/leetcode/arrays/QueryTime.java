package leetcode.arrays;

public class QueryTime {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3};
        int []arr1 = {3,2,7};
        System.out.println(busyStudent(arr,arr1,4));
    }

}
