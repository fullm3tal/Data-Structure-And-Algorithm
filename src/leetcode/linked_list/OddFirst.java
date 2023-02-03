package leetcode.linked_list;

public class OddFirst {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
//        [2,1,3,5,6,4,7]
//        ListNode head = new ListNode(2);
//        ListNode root = head;
//        head.next = new ListNode(1);
//        head = head.next;
//        head.next = new ListNode(3);
//        head = head.next;
//        head.next = new ListNode(5);
//        head = head.next;
//        head.next = new ListNode(6);
//        head = head.next;
//        head.next = new ListNode(4);
//        head = head.next;
//        head.next = new ListNode(7);

        ListNode head = new ListNode(1);
        ListNode root = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);
        head = head.next;
        head.next = new ListNode(6);
        head = head.next;
        head.next = new ListNode(7);
        head = head.next;
        head.next = new ListNode(8);
        System.out.println(oddEvenList4(root));
    }

    public static ListNode oddEvenList3(ListNode head) {
        ListNode sentinel = new ListNode(Integer.MAX_VALUE, head);
        ListNode previous = sentinel;
        ListNode targetPrevious = null;
        while (previous.next != null) {
            if (targetPrevious != null && targetPrevious.next != null) {
                if (targetPrevious.next.val % 2 != 0) {
                    int targetValue = targetPrevious.next.val;
                    previous.next = new ListNode(targetValue, previous.next);
                    targetPrevious.next = targetPrevious.next.next;
                    targetPrevious = null;
                    previous = previous.next;
                } else {
                    if (targetPrevious.next.next != null) {
                        targetPrevious = targetPrevious.next;
                    } else {
                        return sentinel.next;
                    }
                }
            } else {
                if (previous.next.val % 2 != 0) {
                    previous = previous.next;
                } else {
                    targetPrevious = previous.next;
                }
            }
        }
        return sentinel.next;
    }

    public static ListNode oddEvenList4(ListNode head) {
        ListNode sentinel1 = new ListNode(Integer.MAX_VALUE);
        ListNode sentinel2 = new ListNode(Integer.MAX_VALUE);
        ListNode odd = sentinel1;
        ListNode even = sentinel2;
        while (head != null) {
            odd.next = new ListNode(head.val);
            odd = odd.next;
            if (head.next != null) {
                even.next = new ListNode(head.next.val);
                even = even.next;
            }
            if(head.next == null || head.next.next == null) {
               break;
            }
            head = head.next.next;
        }
        odd.next = sentinel2.next;
        return sentinel1.next;
    }

}
