package leetcode.linked_list;

class MergeNodes {

    public static ListNode mergeNodes(ListNode head) {
        ListNode start = new ListNode(head.val);
        ListNode root = start;
        int total = 0;
        ListNode current = head.next;
        while (current != null) {
            if (current.val != 0) {
                total = total+ current.val;
            } else {
                start.next = new ListNode(total);
                start = start.next;
                total = 0;
            }
            current = current.next;
        }
        return root.next;
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

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode root = head;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(1);
        head = head.next;
        head.next = new ListNode(0);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);
        head = head.next;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(0);
        System.out.println(mergeNodes(root));
    }

}
