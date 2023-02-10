package leetcode.linked_list;


public class LinkedListSample {

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
        ListNode head = new ListNode(4);
        ListNode root = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(1);
        head = head.next;
        head.next = new ListNode(3);
        ListNode list = divideLinkedList(root);
        System.out.println(list);
    }

    public static ListNode divideLinkedList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null, secondHalf = head, second = head;
        while (second != null && second.next != null) {
            prev = secondHalf;
            secondHalf = secondHalf.next;
            second = second.next.next;
        }
        prev.next = null;
        ListNode l1 = divideLinkedList(head);
        ListNode l2 = divideLinkedList(secondHalf);
        return merge(l1, l2);
    }


    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return l.next;
    }
}
