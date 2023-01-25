package leetcode.arrays;

public class DistanceBetweenSameLetters {

    public static void main(String[] args) {
        int a = 'a';
        char c = 97;
        int []distance = new int[] {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances("abaccb", distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        int base = 97;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' '){
                continue;
            }
            int index = c - base;
            int dis = distance[index] + i + 1;
            if(dis > s.length()-1){
                return false;
            }
            char target = s.charAt(dis);
            if(target != c){
                return false;
            }
            distance[index] = 0;
           s = s.replace(c,' ');
        }
        return true;
    }

}
