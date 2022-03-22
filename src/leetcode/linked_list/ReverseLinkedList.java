package leetcode.linked_list;

import static leetcode.linked_list.LinkedListProvider.*;

public class ReverseLinkedList {

    public static LinkedListProvider reverseLinkedList(LinkedListProvider list){
        LinkedListProvider newList = new LinkedListProvider();
        newList.head =  new ListNode(list.head.val);
        ListNode currentNode = list.head;
        while (currentNode.next!= null) {
            ListNode activeNode = new ListNode(currentNode.next.val);
            activeNode.next= newList.head;
            newList.head = activeNode;
            currentNode = currentNode.next;
        }
        return newList;
    }

    public static LinkedListProvider reverseLinkedListInPlace(LinkedListProvider list){
        LinkedListProvider newList = new LinkedListProvider();
        newList.head =  new ListNode(list.head.val);
        ListNode currentNode = list.head;
        while (currentNode.next!= null) {
            ListNode activeNode = new ListNode(currentNode.next.val);
            activeNode.next= newList.head;
            newList.head = activeNode;
            currentNode = currentNode.next;
        }
        return newList;
    }

    public static void main(String[] args) {
        LinkedListProvider list = new LinkedListProvider();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);
        LinkedListProvider reverseList = reverseLinkedList(list);
        System.out.println("Reversed");
    }
}
