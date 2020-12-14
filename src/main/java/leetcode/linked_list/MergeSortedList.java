package leetcode.linked_list;

import common.LinkedListNode;

/**
 * Problem:
 * - Merge two sorted linked lists and return it as a new list.
 * Example:
 * - Input: 1 -> 3-> 5 & 2 -> 4-> 6
 * Output: 1 -> 2-> 3 -> 4 -> 5 -> 6
 * Approach:
 * - Traverse both list at the same time, compare their values at each step and
 * add the smaller one to a new list.
 * Solution:
 * - Initialize a dummy head to keep track of the head node.
 * - Traverse both lists while they are are not empty.
 * - Compare their values at each step and add the smaller one to a new list.
 * - Remember to check if we have reached the end for a list faster than the
 * other.
 * - If that is the case, simply add the rest of the other list to the new list
 * since it is already sorted.
 * Cost:
 * - O(n|m) time, O(n+m) space where n and m are lengths of these two linked lists.
 */
public class MergeSortedList {
    public LinkedListNode mergeTwoLists(LinkedListNode l1, LinkedListNode l2) {
        final LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) current.next = l1;
        else if (l2 != null) current.next = l2;

        return dummy.next;
    }
}
