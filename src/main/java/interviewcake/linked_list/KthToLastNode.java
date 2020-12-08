package interviewcake.linked_list;

import common.LinkedListNode;

/**
 * Problem:
 * - Find the kth to last node in a linked list.
 * Example:
 * - Input: list = 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 2
 * Output: 5, because 5 is the 2nd to the last node (6)
 * Approach:
 * - Use two pointers such that one starts at the beginning and the other one
 * starts at k distance apart.
 * - Walk both at the same speed toward the end.
 * - When one hits the tail, the other one is on the target node.
 * Solution:
 * - Start both nodes, a left one and a right one, at the beginning.
 * - Move the right one to the kth node.
 * - Move both of them until the right one hits the end.
 * - Return the left one.
 * Cost:
 * - O(n) time and O(1) space.
 */
public class KthToLastNode {
    public LinkedListNode kthToLastNode(int k, LinkedListNode head) {
        LinkedListNode curr = head;
        int count = 0;

        while (curr != null) {
            curr = curr.next;
            count++;
        }

        curr = head;

        for (int i = 0; i < count - k; i++) {
            curr = curr.next;
        }

        return curr;
    }
}
