package leetcode.linked_list;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ListNode traverseNode = head;
        boolean hasNodes = true;
        ListNode parent = new ListNode(head.val);
        traverseNode = traverseNode.next;
        while (hasNodes) {
            if (traverseNode.next == null) {
                hasNodes = false;
            }
            parent = new ListNode(traverseNode.val, parent);
            traverseNode = traverseNode.next;
        }
        hasNodes = true;
        while (hasNodes) {
            if (head.val == parent.val) {
                head = head.next;
                parent = parent.next;
            } else {
                return false;
            }
            if (head == null) {
                hasNodes = false;
            }
        }
        return true;
    }


    public static boolean isPalindrome2(ListNode head) {
        if(head == null) return false;

        ListNode reverse = null, slow = head, fast = head;

        while(fast != null && fast.next != null){
            ListNode temp = reverse;
            reverse = slow;
            slow = slow.next;
            fast = fast.next.next;
            reverse.next = temp;
        }

        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            if(reverse.val != slow.val) return false;
            reverse = reverse.next;
            slow = slow.next;
        }

        return true;
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
//        [1,1,2,1]
        ListNode head = new ListNode(1);
        ListNode current = head;
        head.next = new ListNode(1);
        head = head.next;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(1);
        System.out.println(isPalindrome2(current));
    }

}





