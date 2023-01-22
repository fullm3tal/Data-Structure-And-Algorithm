package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnableToEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        List<Integer> listStudents = new ArrayList<>();
        for (int student : students) {
            listStudents.add(student);
        }
        int indexStudent = 0;
        int indexSandwich = 0;
        boolean studentsEating = true;
        while (studentsEating) {
            if (listStudents.get(indexStudent) == sandwiches[indexSandwich]) {
                listStudents.remove(indexStudent);
                sandwiches[indexSandwich] = -1;
                indexSandwich++;
                --indexStudent;
            } else if (!listStudents.contains(sandwiches[indexSandwich])) {
                studentsEating = false;
            }
            indexStudent++;
            if (indexStudent >= listStudents.size()) {
                indexStudent = 0;
            }
            if (indexSandwich >= sandwiches.length) {
                studentsEating = false;
            }
        }
        return listStudents.size();
    }

    public static int countStudents2(int[] students, int[] sandwiches) {
        int count1 = 0, count0 = 0;
        for (int s : students) {
            if (s == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        int total = sandwiches.length;
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 1 && count1 > 0) {
                total--;
                count1--;
            } else if (sandwiches[i] == 0 && count0 > 0) {
                total--;
                count0--;
            } else {
                break;
            }
        }
        return total;
    }

    public static void main(String[] args) {

//        int[] students = new int[]{1, 1, 0, 0};
//        int[] sandwiches = new int[]{0, 1, 0, 1};

        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};

        System.out.println(countStudents2(students, sandwiches));
    }


}
