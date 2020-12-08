package interviewcake.linked_list;

import common.LinkedListNode;
import junit.framework.TestCase;

/**
 * Problem:
 * - Delete a node from a singly-linked list, given only a pointer to that node.
 * Approach:
 * - Since we don't have access to the previous node, simply copy the value and
 * pointer of the next node and copy them into the current node.
 * Cost:
 * - O(1) time and O(1) space.
 */
public class DeleteNodeGivenJustPointerToThatNodeTest extends TestCase {
    private LinkedListNode appendToList(final LinkedListNode head, int value) {
        LinkedListNode current = head;
        while (current.next != null)
            current = current.next;
        current.next = new LinkedListNode(value);
        return current.next;
    }

    public void testDeleteNode() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode nodeToDelete = appendToList(head, 2);
        appendToList(head, 3);
        appendToList(head, 4);

        new DeleteNodeGivenJustPointerToThatNode().deleteNode(nodeToDelete);

        LinkedListNode node = head;
        assertEquals(1, node.value);

        node = node.next;
        assertEquals(3, node.value);

        node = node.next;
        assertEquals(4, node.value);

        assertNull(node.next);
    }
}
