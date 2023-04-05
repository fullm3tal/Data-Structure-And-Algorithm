package leetcode.arrays;

public class MoveBallsInBoxes {

    public static void main(String[] args) {
        String boxes = "110";
        int [] array= minOperations(boxes);
         System.out.println(array.length);
    }

    public static int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] result = new  int[len];
        for (int i=0;i<len;i++) {
            result[i] = Integer.parseInt(String.valueOf(boxes.charAt(i)));
        }
        int[] moves = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j= 0; j< len; j++) {
                if (i==j) {
                    continue;
                }
                if(result[j]==1) {
                    moves[i] += Math.abs(i-j);
                }
            }
        }
        return moves;
    }
}
