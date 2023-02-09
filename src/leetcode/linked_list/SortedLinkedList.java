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

    public static ListNode sortList3(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode root = head;
        boolean startSorting = true;
        boolean swapped;
        int count = 0;
        while (root != null) {
            count++;
            root = root.next;
        }
        while (startSorting) {
            swapped = false;
            root = head;
            while (root.next != null) {
                if (root.val > root.next.val) {
                    swapped = true;
                    int temp = root.val;
                    root.val = root.next.val;
                    root.next.val = temp;
                }
                root = root.next;
            }
            count--;
            if (count == 0 || !swapped) {
                startSorting = false;
            }
        }
        return head;
    }


    public static ListNode sortList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode refNode = head;
        ListNode root = head;
        ListNode smallestNode = refNode;
        while (refNode != null) {
            while (root != null) {
                if (smallestNode.val < root.val) {
                    int temp = root.val;
                    root.val = smallestNode.val;
                    smallestNode.val = temp;
                }
                root = root.next;
            }
            refNode = refNode.next;
            root = refNode;
            smallestNode = refNode;
        }
        return head;
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
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

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }



    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        ListNode root = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(1);
        head = head.next;
        head.next = new ListNode(3);
        ListNode list = sortList(root);
        System.out.println(list);

    }


}
