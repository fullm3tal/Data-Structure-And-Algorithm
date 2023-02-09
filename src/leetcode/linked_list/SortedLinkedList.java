package leetcode.linked_list;

public class SortedLinkedList {

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

    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode root = head;
        boolean isSorted = true;
        int count = 0;
        while (root != null) {
            count++;
            root = root.next;
        }
        while (isSorted) {
            root = head;
            while (root.next != null) {
                if (root.val > root.next.val) {
                    int temp = root.val;
                    root.val = root.next.val;
                    root.next.val = temp;
                }
                root = root.next;
            }
            count--;
            if (count == 0) {
                isSorted = false;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        ListNode root = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(1);
        head = head.next;
        head.next = new ListNode(3);
        System.out.println(sortList(root));

    }


}
