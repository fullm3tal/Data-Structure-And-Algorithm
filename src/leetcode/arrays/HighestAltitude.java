package leetcode.arrays;

public class HighestAltitude {

    public static int largestAltitude(int[] gain) {
//        -5,1,5,0,-7
        int currentAlt = 0;
        int alt = 0;
        for (int i = 0; i < gain.length; i++) {
            if (gain[i] + currentAlt > alt) {
                alt = gain[i]+currentAlt;
            }
            currentAlt = gain[i] + currentAlt;
        }
        return alt;
    }

    public static void main(String[] args) {
        int []arr = { -5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }


}

