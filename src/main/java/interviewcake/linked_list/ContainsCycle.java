package interviewcake.linked_list;

import common.LinkedListNode;

/**
 * Problem:
 * - Determine if a singly-linked list has a cycle.
 * Approach:
 * - Keep two pointers starting at the first node such that: every time one moves
 * one node ahead, the other moves 2 nodes ahead.
 * - If the linked list has a cycle, the faster one will catch up with the slow
 * one. Otherwise, the faster one will each the end.
 * Solution:
 * - Keep two pointers, a slow one and a fast one, at the beginning.
 * - Traverse the list and move the fast one 2 nodes once the slow one move a node.
 * - If the fast one catches the slow one, there exists a cycle.
 * Cost:
 * - O(n) time and O(1) space.
 */

public class ContainsCycle {
    public boolean containsCycle(LinkedListNode firstNode) {
        LinkedListNode slow = firstNode;
        LinkedListNode fast = firstNode;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }

        return false;
    }
}
