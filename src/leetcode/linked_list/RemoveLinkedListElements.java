package leetcode.linked_list;

public class RemoveLinkedListElements {


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

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode node = head;
        ListNode previous = null;
        boolean hasNode = true;
        while (hasNode) {
            if (node.val == val) {
                if (previous == null) {
                    node = node.next;
                    head = node;
                } else {
                    previous.next = node.next;
                    node = previous.next;
                }
            } else {
                previous = node;
                node = node.next;
            }
            if (node == null) {
                hasNode = false;
            }

        }
        return head;
    }

    public static ListNode removeElements2(ListNode head, int val) {
        ListNode sentinel = new ListNode(0, head);
        ListNode prev = sentinel;
        ListNode curr = head;

        while(curr != null) {
            if(curr.val == val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode root = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(6);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);
        head = head.next;
        head.next = new ListNode(6);

//        ListNode head = new ListNode(7);
//        ListNode root = head;
//        head.next = new ListNode(7);
//        head = head.next;
//        head.next = new ListNode(7);
//        head = head.next;
//        head.next = new ListNode(7);
        System.out.println(removeElements2(root, 6));
    }


}
