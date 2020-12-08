package interviewcake.linked_list;

import common.LinkedListNode;

/**
 * Problem:
 * - Reverse a linked list in-place.
 * Approach:
 * - Iterate through the list and point each node's next pointer to the previous
 * item.
 * Cost:
 * - O(n) time and O(1) space.
 */
public class ReverseListInPlace {
    public LinkedListNode reverse(LinkedListNode headOfList) {
        LinkedListNode curr = headOfList;
        LinkedListNode prev = null;
        LinkedListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // curr is always null
        return prev;
    }
}
