package leetcode.linked_list;

public class AddTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode();
        ListNode current = sentinel;
        int carry = 0, sum;
        while (l1 != null || l2 != null || carry > 0) {
            sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sentinel.next = new ListNode(sum% 10);
            carry = sum/10;
            sentinel = sentinel.next;
        }
        return current.next;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(5);
//        ListNode root = head;
//        head.next = new ListNode(2);
//        head = head.next;
//        head.next = new ListNode(13);
//        head = head.next;
//        head.next = new ListNode(3);
//        head = head.next;
//        head.next = new ListNode(8);

        ListNode head = new ListNode(9);
        ListNode root1 = head;
        head.next = new ListNode(9);
        head = head.next;
        head.next = new ListNode(9);
        head = head.next;
        head.next = new ListNode(9);
        head = head.next;
        head.next = new ListNode(9);
        head = head.next;
        head.next = new ListNode(9);
        head = head.next;
        head.next = new ListNode(9);

        ListNode first = new ListNode(9);
        ListNode root2 = first;
        first.next = new ListNode(9);
        first = first.next;
        first.next = new ListNode(9);
        first = first.next;
        first.next = new ListNode(9);

        System.out.println(addTwoNumbers(root1, root2));

    }

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


}
