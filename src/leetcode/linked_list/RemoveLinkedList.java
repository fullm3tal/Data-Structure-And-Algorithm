package leetcode.linked_list;

public class RemoveLinkedList {

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

    public static ListNode removeNodes(ListNode head) {
        ListNode sentinel = new ListNode(Integer.MAX_VALUE);
        sentinel.next = new ListNode(head.val);
        ListNode previous = sentinel;
        ListNode startIndex = sentinel;
        ListNode index = sentinel.next;
        ListNode current = head;
        current = current.next;
        while (current != null) {
            if (current.val > previous.next.val) {
                while (startIndex.next != null) {
                    if (startIndex.next.val < current.val) {
                        if (startIndex.next.next != null) {
                            startIndex.next = startIndex.next.next;
                        } else {
                            startIndex.next = null;
                        }
                    } else {
                        startIndex = startIndex.next;
                    }
                }
                startIndex.next = new ListNode(current.val);
                previous = startIndex;
                index = startIndex;
                startIndex = sentinel;
            } else {
                index.next = new ListNode(current.val);
                previous = previous.next;
            }
            index = index.next;
            current = current.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode root = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(13);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(8);
//        ListNode head = new ListNode(1);
//        ListNode root = head;
//        head.next = new ListNode(1);
//        head = head.next;
//        head.next = new ListNode(1);
//        head = head.next;
//        head.next = new ListNode(1);
//        head = head.next;
//        head.next = new ListNode(1);
        System.out.println(removeNodes(root));
    }

}


