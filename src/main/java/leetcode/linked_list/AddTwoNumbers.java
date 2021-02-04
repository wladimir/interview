package leetcode.linked_list;

import common.LinkedListNode;

/**
 * Problem:
 * - Given two linked lists representing two non-negative numbers, add them together
 * and return it as a linked list.
 * Assumption:
 * - The digits are stored in reverse order.
 * - Each node contains a single digit.
 * Example:
 * - Input: (1 -> 6 -> 4) +
 * <p>      (2 -> 6 -> 1)</p
 * Output:  (3 -> 2 -> 6)
 * Approach:
 * - Traverse both lists and keep track of the sum and carry for each
 * digit.
 * Solution:
 * - Initialize dummy heads to keep track of the head nodes.
 * - While either list is not empty, calculate the sum of corresponding
 * digits, update it carry at each step and add it after the current node.
 * - If the sum have an extra carry at the end, simply make a new node and
 * add it in the end.
 * Cost:
 * - O(n|m) time, O(m|n) space where m and m are lengths of these two lists.
 */
public class AddTwoNumbers {
    public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        final LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;

        LinkedListNode first = l1;
        LinkedListNode second = l2;

        int carry = 0;
        while (first != null || second != null) {
            int v1 = first == null ? 0 : first.value;
            int v2 = second == null ? 0 : second.value;

            int sum = v1 + v2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            final LinkedListNode newNode = new LinkedListNode(digit);
            current.next = newNode;
            current = current.next;

            if (first != null) first = first.next;
            if (second != null) second = second.next;
        }

        if (carry > 0) {
            final LinkedListNode newNode = new LinkedListNode(carry);
            current.next = newNode;
        }

        return dummy.next;
    }
}
