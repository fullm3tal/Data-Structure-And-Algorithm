package leetcode.linked_list;

import leetcode.linked_list.LinkedListProvider.ListNode;

public class MergeList {

    public static void main(String[] args) {
        LinkedListProvider l1 = new LinkedListProvider();
        l1.push(5);


        LinkedListProvider l2 = new LinkedListProvider();
        l2.push(1);
        l2.push(2);
        l2.push(3);
        l2.push(4);
        LinkedListProvider.ListNode l3 = mergeTwoLists2(l1.head, l2.head);
        System.out.println();
    }

    //    Input: l1 = [1,2,4], l2 = [1,3,4]
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode node = null;
        ListNode itrNode = null;
        while (l1 != null && l2 != null) {
            ListNode currentNode = new ListNode(l2.val);
            if (node == null) {
                node = new ListNode(l1.val);
                itrNode = node;
                itrNode.next = currentNode;
            } else {
                itrNode.next = new ListNode(l1.val);
                itrNode = itrNode.next;
                itrNode.next = currentNode;
            }
            l2 = l2.next;
            l1 = l1.next;
            itrNode = itrNode.next;
        }

        if (l1 != null) {
            if (itrNode != null) {
                itrNode.next = l1;
            } else {
                node = l1;
            }
        }

        if (l2 != null) {
            if (itrNode != null) {
                itrNode.next = l2;
            } else {
                node = l2;
            }
        }
        return node;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode node = null;
        ListNode itrNode = null;
        int val1;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                val1 = l1.val;
                l1 = l1.next;
            } else{
                val1 = l2.val;
                l2 = l2.next;
            }
            if (node == null) {
                node = new ListNode(val1);
                itrNode = node;
            } else {
                itrNode.next = new ListNode(val1);
                itrNode = itrNode.next;
            }
        }

        if (l1 != null) {
            if (itrNode != null) {
                itrNode.next = l1;
            } else {
                node = l1;
            }
        }

        if (l2 != null) {
            if (itrNode != null) {
                itrNode.next = l2;
            } else {
                node = l2;
            }
        }

        return node;
    }

}
