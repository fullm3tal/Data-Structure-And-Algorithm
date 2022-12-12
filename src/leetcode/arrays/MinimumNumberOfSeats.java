package leetcode.arrays;

public class MinimumNumberOfSeats {


    public static void main(String[] args) {
        int[] seats = new int[]{3, 1, 5};
        int[] students = new int[]{2, 7, 4};
        System.out.println(minMovesToSeat(seats, students));
        for (int i : insertionSort(seats)) {
            System.out.println(i);
        }
    }


    public static int minMovesToSeat(int[] seats, int[] students) {
        for (int i = 1; i < seats.length; i++) {
            int current = seats[i];
            int j = i - 1;
            while (j >= 0 && current > seats[j]) {
                seats[j + 1] = seats[j];
                j--;
            }
            seats[j + 1] = current;
        }

        for (int i = 1; i < students.length; i++) {
            int current = students[i];
            int j = i - 1;
            while (j >= 0 && current > students[j]) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            count = count + Math.abs(students[i] - seats[i]);
        }
        return count;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }


}

