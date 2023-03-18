package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HackerrankMaximumMeetingTest {

    /*
    *  Find out the max meeting rooms that would be needed to attend the meetings
    *  1:4
    *  1:5
    *  5:6
    *  6:10
    *  7:9
    * */

    public static void main(String[] args) {
        List<List<Integer>> meetings = new ArrayList<>();
        for (int i =0;i< 10; i++) {
            List<Integer> meet = new ArrayList<>();
            meet.add(i);
            meet.add(1);
            meetings.add(meet);
         }
        System.out.println(meetingRoom(meetings));
    }

    public static int meetingRoom(List<List<Integer>> meeting) {
        int count = 0;
        int [] arr= new int[30];
        for (int i=0;i< meeting.size();i++) {
            arr[meeting.get(i).get(0)]++;
        }
        for (int i=0;i<arr.length; i++) {
            if (arr[i]> count){
                count = arr[i];
            }
        }
        return count;
    }

}
