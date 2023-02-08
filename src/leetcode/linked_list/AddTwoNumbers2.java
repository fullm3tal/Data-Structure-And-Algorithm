package leetcode.linked_list;

import javax.swing.*;

public class AddTwoNumbers2 {

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode();
        ListNode current = sentinel;
        ListNode l1Temp = l1, l2Temp = l2;
        current.next = l1;
        int count1 = 0, count2 = 0;
        int diff = 0;
        boolean hasNodes = true;
        while (hasNodes) {
            if (l1Temp != null) {
                count1++;
                l1Temp = l1Temp.next;
            }
            if (l2Temp != null) {
                count2++;
                l2Temp = l2Temp.next;
            }
            if (l1Temp == null && l2Temp == null) {
                hasNodes = false;
            }
            if (count1 < count2) {
                current.next = l2;
            }
            current = current.next;
            diff = Math.abs(count2 - count1);
        }
        hasNodes = true;
        while (hasNodes) {
            if (diff < 0) {
            }
            if (current == null) {
                hasNodes = false;
            }
        }

        return sentinel.next;
    }


    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode current ;
        ListNode l1Temp = l1, l2Temp = l2;
        ListNode rev1 = new ListNode(l1Temp.val), rev2 = new ListNode(l2Temp.val);
        l1Temp = l1Temp.next;
        l2Temp = l2Temp.next;
        ListNode temp;
        boolean hasNodes = true;
        while (hasNodes) {
            if (l1Temp != null) {
                temp = new ListNode(l1Temp.val, rev1);
                rev1 = temp;
                l1Temp = l1Temp.next;
            }
            if (l2Temp != null) {
                temp = new ListNode(l2Temp.val, rev2);
                rev2 = temp;
                l2Temp = l2Temp.next;
            }
            if (l1Temp == null && l2Temp == null) {
                hasNodes = false;
            }
        }
        current = addTwoNumbers3(rev1, rev2);
        ListNode rev = new ListNode(current.val);
        current = current.next;
        while (current != null) {
            temp = new ListNode(current.val, rev);
            rev = temp;
            current = current.next;
        }
        return rev;
    }

    public static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode();
        ListNode current = sentinel;
        int carry = 0, sum;
        while (l1 != null || l2 != null || carry > 0) {
            sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sentinel.next = new ListNode(sum % 10);
            carry = sum / 10;
            sentinel = sentinel.next;
        }
        return current.next;
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

        ListNode head = new ListNode(7);
        ListNode root1 = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(3);

        ListNode first = new ListNode(5);
        ListNode root2 = first;
        first.next = new ListNode(6);
        first = first.next;
        first.next = new ListNode(4);

        System.out.println(addTwoNumbers2(root1, root2));

    }


}
