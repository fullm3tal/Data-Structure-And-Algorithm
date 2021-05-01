package leetcode.linked_list;

import leetcode.linked_list.LinkedListProvider.ListNode;

public class LinkedListMid {

    public static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        return forLoop(head, length / 2);
    }

    static ListNode forLoop(ListNode head, int len) {
        for (int i = 0; i < len; i++) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
//        11
//12
//8
//18
//16
//5
//18
        LinkedListProvider provider = new LinkedListProvider();
        provider.push(11);
        provider.push(12);
        provider.push(8);
        provider.push(18);
        provider.push(16);
        provider.push(5);
        provider.push(18);
        provider.delete(0);
        ListNode node = middleNode(provider.head);

        System.out.println(node.val);
    }

}
