package leetcode.arrays;

public class SortPeople {

    public static void main(String[] args) {
        String []names = new String[]{"Alice","Bob","Bob"};
        int []heights = new int[]{155,185,150};
        for (String name : sortPeople(names, heights)) {
            System.out.println(name);
        }
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            int count = i + 1;
            int index = i;
            while (count < heights.length) {
                if (heights[index] < heights[count]) {
                    index = count;
                }
                count++;
            }
            int temp = heights[i];
            heights[i] = heights[index];
            heights[index] = temp;
            String tempName = names[i];
            names[i] = names[index];
            names[index] = tempName;
        }
        return names;
    }

    public static String[] sortPeople2(String[] names, int[] heights) {
        for (int i=1;i<heights.length;i++) {
            int j = i-1;
             int currentHeight = heights[i];
             String currentName = names[i];
             while (j>=0 && heights[j] < currentHeight) {
                 heights[j+1] = heights[j];
                 names[j+1] = names[j];
                 j--;
             }
             heights[j+1] = currentHeight;
             names[j+1] =currentName;
        }
        return names;
    }

}
