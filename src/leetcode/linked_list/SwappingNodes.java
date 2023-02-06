package leetcode.linked_list;

public class SwappingNodes {

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

//    public static ListNode swapNodes(ListNode head, int k) {
//        ListNode root = head;
//        int count = 0;
//        while (root != null) {
//            count++;
//            root = root.next;
//        }
//        if (count == 1) {
//            return head;
//        }
//        if (count == 2) {
//            int temp = head.val;
//            head.val = head.next.val;
//            head.next.val = temp;
//            return head;
//        }
//        ListNode start = null;
//        int index = 0;
//        int indexLast = count - k + 1;
//        ListNode last = null;
//        root = head;
//        while (root != null) {
//            index++;
//            if (index == k) {
//                start = root;
//            }
//            if (index == indexLast) {
//                last = root;
//            }
//            root = root.next;
//        }
//        if (start != null && last != null) {
//            int temp = start.val;
//            start.val = last.val;
//            last.val = temp;
//        }
//        return head;
//    }

    public static ListNode swapNodes(ListNode head, int k) {
        int count = 1;
        ListNode p = head, q = head, node = null;
        for(int i=1; i<k; i++)
            p = p.next;

        node = p;
        p = p.next;

        while(p!=null)
        {
            p = p.next;
            q = q.next;
        }

        int temp = node.val;
        node.val = q.val;
        q.val = temp;


        return head;
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


//[91,56,48,77,91,96,55,53,68]

        ListNode head = new ListNode(91);
        ListNode root = head;
        head.next = new ListNode(56);
        head = head.next;
        head.next = new ListNode(48);
        head = head.next;
        head.next = new ListNode(77);
        head = head.next;
        head.next = new ListNode(91);
        head = head.next;
        head.next = new ListNode(96);
        head = head.next;
        head.next = new ListNode(55);
        head = head.next;
        head.next = new ListNode(53);
        head = head.next;
        head.next = new ListNode(68);


//        ListNode head = new ListNode(7);
//        ListNode root = head;
//        head.next = new ListNode(9);
//        head = head.next;
//        head.next = new ListNode(6);
//        head = head.next;
//        head.next = new ListNode(6);
//        head = head.next;
//        head.next = new ListNode(8);
//        head = head.next;
//        head.next = new ListNode(7);
//        head = head.next;
//        head.next = new ListNode(3);
//        head = head.next;
//        head.next = new ListNode(0);
//        head = head.next;
//        head.next = new ListNode(9);
//        head = head.next;
//        head.next = new ListNode(5);
        System.out.println(swapNodes(root, 7));
    }


}
