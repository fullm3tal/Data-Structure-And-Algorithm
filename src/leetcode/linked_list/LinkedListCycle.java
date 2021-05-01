package leetcode.linked_list;

import leetcode.linked_list.LinkedListProvider.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null) return false;
        ListNode deer = head.next;
        while (deer != head) {
            if (deer == null || deer.next == null) return false;
            deer = deer.next.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

