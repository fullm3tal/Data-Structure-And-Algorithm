package leetcode.linked_list;

import leetcode.linked_list.LinkedListProvider.ListNode;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            int value = head.val;
            if (node == null) {
                node = new ListNode(value);
            } else {
                ListNode currentNode = new ListNode(value);
                currentNode.next = node;
                node = currentNode;
            }
            head = head.next;
        }
        return node;
    }

    public static void insert(ListNode head, int value) {
        if (head == null) {
            head = new ListNode(value);
            return;
        }
        while (head.next!= null){
            head = head.next;
        }
        ListNode node = new ListNode(value);
         head.next = node;
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(23);
        insert(node,232);
        insert(node,2352);
        insert(node,23236);
        insert(node,2342);
        insert(node,2342);
        insert(node,232323);
        insert(node,2332);
        System.out.println();
    }

}
