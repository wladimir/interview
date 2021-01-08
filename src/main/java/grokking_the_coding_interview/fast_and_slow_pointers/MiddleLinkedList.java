package grokking_the_coding_interview.fast_and_slow_pointers;

import common.LinkedListNode;

/**
 * Problem:
 * - Given the head of a singly linked list, write a function to return the
 * middle value.
 * Approach:
 * - Have a slow pointer move one step at a time while the fast one move
 * 2 steps at a time.
 * - Once the fast one reaches the end, the slow is in the middle.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class MiddleLinkedList {
    public LinkedListNode findMiddle(final LinkedListNode head) {
        LinkedListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
