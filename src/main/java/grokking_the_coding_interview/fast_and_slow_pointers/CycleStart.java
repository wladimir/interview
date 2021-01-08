package grokking_the_coding_interview.fast_and_slow_pointers;

import common.LinkedListNode;

/**
 * Problem:
 * - Given the head of a singly linked list, write a function to find the
 * starting node of the cycle.
 * Approach:
 * - Similar to finding a cycle in a linked list problem, can also determine
 * the start of its cycle and calculate length k of the cycle.
 * - Have one pointer at the beginning and one at kth node of the linked list.
 * - Move both of them until they meet at the start of the cycle.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class CycleStart {
    public LinkedListNode findCycleStart(LinkedListNode head) {
        int cycleLength = 0;

        LinkedListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycleLength = findCycleLength(slow);
                break;
            }
        }

        return findStart(head, cycleLength);
    }

    private int findCycleLength(final LinkedListNode slow) {
        LinkedListNode current = slow;
        int count = 0;

        do {
            current = current.next;
            count++;
        } while (current != slow);

        return count;
    }

    private LinkedListNode findStart(final LinkedListNode head, int cycleLength) {
        LinkedListNode slow = head, fast = head;

        while (cycleLength > 0) {
            fast = fast.next;
            cycleLength--;
        }

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // or fast
    }
}
