package leetcode.arrays;

public class ContainerWithWater {

    public static int maxArea(int[] height) {
        int area = 0;
        for (int i = 0, j = height.length - 1; i < height.length-1 && j >= 0; i = i) {
            int containerArea = 1;
            int containerSize = (j + 1) - (i + 1);
            if (height[i] < height[j]) {
                containerArea = height[i] * containerSize;
                i++;
            } else if (height[j] < height[i]) {
                containerArea = height[j] * containerSize;
                j--;
            } else if (height[j] == height[i]) {
                containerArea = height[j] *containerSize;
                i++;
                j--;
            }
            if (containerArea > area) {
                area = containerArea;
            }
            if(i > j) {
                break;
            }
        }
        return area;
    }

    public static int maxArea2(int[] height) {
        int area = 0;
        int j = height.length - 1;
        for (int i = 0; i < height.length - 1; i++) {
            int containerArea = 1;
            int containerSize = j - i;
            if (height[i] < height[j]) {
                containerArea = height[i] * containerSize;
                if(height[i+1] < height[i] * 2) {
                    i--;
                }
            } else if (height[j] < height[i]) {
                containerArea = height[j] * containerSize;
                if(height[j-1] > 2 * height[j]) {
                    j--;
                }
            } else if (height[j] == height[i]) {
                containerArea = height[j] * containerSize;
                if(height[j-1] > 2 * height[j]) {
                    j--;
                }
            }
            if (containerArea > area) {
                area = containerArea;
            }
        }
        return area;
    }

    public static int maxArea3(int[] height) {
        int area = 0;
        int left = 1;
        int right = 1;
        for (int i = 0, j = height.length - 1; i < height.length - 1; i++, j--) {
            if(height[i] >  left ) {
                left = height[i];
            }
            if(height[j]>  right * 2 ) {
                right = height[j];
            }
            int containerArea = 1;
            int containerSize = (j + 1) - (i + 1);
            if (left < right) {
                containerArea = left * containerSize;
            } else if (right < left) {
                containerArea = right * containerSize;
            } else if (right == left) {
                containerArea = right * containerSize;
            }
            if (containerArea > area) {
                area = containerArea;
            }
        }
        return area;
    }

    public static void main(String[] args) {
//        int[] heights = {1, 8, 6, 2, 5, 4, 8, 25, 7};
//        int[] heights = {4, 3, 2, 1, 4};
        int[] heights =  {2,3,4,5,18,17,6};
        System.out.println(maxArea3(heights));
    }

}
