package leetcode.linked_list;

import leetcode.linked_list.LinkedListProvider.ListNode;

public class DeleteDuplicateNode {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode previousNode = null;
        ListNode node = head;
        while (node != null) {
            if (previousNode != null) {
                if (previousNode.val == node.val) {
                 previousNode.next = node.next;
                 node =previousNode;
                }
            }
            previousNode = node;
            node = node.next;
        }
        return head;
    }


    public static void main(String[] args) {
        LinkedListProvider provider = new LinkedListProvider();
        provider.push(1);
        provider.push(1);
        provider.push(2);
        provider.push(4);
        provider.push(4);
        provider.push(5);
        ListNode node = deleteDuplicates(provider.head);
        System.out.println(node.val);
    }


}
