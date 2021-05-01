package leetcode.linked_list;

import leetcode.linked_list.LinkedListProvider.ListNode;

import java.util.ArrayList;

class DecimalRepresentation {

    ListNode head;


    public void push(int new_data) {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }


    public static int getDecimalValue(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int sum = 0;
        for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
            int num = list.get(j);
            if (num == 0) {
                if (j != list.size() - 1)
                    sum = (int) (sum + (Math.pow(0, i)));
            } else {
                sum = (int) (sum + (Math.pow(2, i)));
            }
        }
        return sum;
    }

    public static int getDecimalValueOptimized(ListNode head) {
        int res = 0;
        while (head != null) {
            res = res << 1 | head.val;
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        DecimalRepresentation decimalRepresentation = new DecimalRepresentation();
        decimalRepresentation.push(0);
        decimalRepresentation.push(0);
        decimalRepresentation.push(0);
        decimalRepresentation.push(0);
        decimalRepresentation.push(0);
        decimalRepresentation.push(0);
        decimalRepresentation.push(1);
        decimalRepresentation.push(1);
        decimalRepresentation.push(1);
        decimalRepresentation.push(0);
        decimalRepresentation.push(0);
        decimalRepresentation.push(1);
        decimalRepresentation.push(0);
        decimalRepresentation.push(0);
        decimalRepresentation.push(1);
        int decimalValue = getDecimalValueOptimized(decimalRepresentation.head);
        System.out.println(decimalValue);
    }

}
