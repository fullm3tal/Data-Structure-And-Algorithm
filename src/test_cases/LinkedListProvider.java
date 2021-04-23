package test_cases;

public class LinkedListProvider {
    ListNode head;
    ListNode last;

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

    public void push(int newData) {
        ListNode newNode = new ListNode(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public ListNode delete(int position) {
        int counter = 0;
        ListNode previousNode;
        ListNode currentNode = head;
        if (position == 0) {
            head = head.next;
        } else {
            while (counter < position - 1) {
                currentNode = currentNode.next;
                counter++;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            previousNode.next = currentNode.next;
            currentNode.next = null;
        }
        return head;
    }

}

